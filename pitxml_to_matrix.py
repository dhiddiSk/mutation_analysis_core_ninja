import xml.etree.cElementTree as ET
import sys

OPERATORS = {
"org.pitest.mutationtest.engine.gregor.mutators.ConditionalsBoundaryMutator":True,
"org.pitest.mutationtest.engine.gregor.mutators.IncrementsMutator":True,
"org.pitest.mutationtest.engine.gregor.mutators.InvertNegsMutator":True,
"org.pitest.mutationtest.engine.gregor.mutators.MathMutator":True,
"org.pitest.mutationtest.engine.gregor.mutators.NegateConditionalsMutator":True,
"org.pitest.mutationtest.engine.gregor.mutators.ReturnValsMutator":True,
"org.pitest.mutationtest.engine.gregor.mutators.VoidMethodCallMutator":True}

def to_key(mutation):
    clz = list(mutation.findall('mutatedClass'))[0].text
    method = list(mutation.findall('mutatedMethod'))[0].text
    desc = list(mutation.findall('methodDescription'))[0].text
    line = list(mutation.findall('lineNumber'))[0].text
    mutator = list(mutation.findall('mutator'))[0].text
    index = list(mutation.findall('index'))[0].text #killingTests, succeedingTests

    return "%s.%s%s[%s][%s:%s]" % (clz, method, desc, line, mutator, index)

def k_tests(mutation, tests): # killing is 1 succeeding is 0
    kt = list(mutation.findall('killingTests'))
    ktests = []
    if kt and kt[0].text:
        ktests = kt[0].text.split('|')
    return [('1' if t in ktests else '0') for t in tests]

def identify_mutants(root):
    mutants = {}
    n_mutants = 0
    for mutation in root.findall("./mutation"):
        mutator = list(mutation.findall('mutator'))[0].text
        mid = n_mutants
        if mutator in OPERATORS: n_mutants += 1
        else: continue
        mutants[to_key(mutation)] = mid
    return mutants

def identify_tests(root):
    my_tests = {}
    n_mutants = 0
    for mutation in root.findall("./mutation"):
        mutator = list(mutation.findall('mutator'))[0].text
        mid = n_mutants
        if mutator in OPERATORS: n_mutants += 1
        else: continue # only use tests that kill default mutants

        kt = list(mutation.findall('killingTests'))
        if kt and kt[0].text:
            ktests = kt[0].text
            for t in ktests.split('|'):
                my_tests[t] = 0
        st = list(mutation.findall('succeedingTests'))
        if st and st[0].text:
            stests = st[0].text
            for t in stests.split('|'):
                my_tests[t] = 0
    for i,t in enumerate(sorted(my_tests)):
        my_tests[t] = i
    return my_tests


def to_matrix(root):
    tests = identify_tests(root)
    mutants = identify_mutants(root)
    # so we have #(mutants) number of rows, with #(tests) number of tests.
    matrix = []
    for mutation in root.findall("./mutation"):
        k = to_key(mutation)
        if k not in mutants: continue
        kt = k_tests(mutation, tests)
        matrix.append(kt)
    return matrix

tree = ET.parse(sys.argv[1])
root = tree.getroot() 
root_tag = root.tag
assert root_tag == 'mutations'


matrix = to_matrix(root)
for i,m in enumerate(matrix):
    print("%d,%s" % (i, ','.join(m)))

