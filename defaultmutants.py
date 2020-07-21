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

tree = ET.parse(sys.argv[1])
root = tree.getroot() 
root_tag = root.tag
assert root_tag == 'mutations'
for mutation in root.findall("./mutation"):
    mutator = list(mutation.findall('mutator'))[0].text
    if mutator not in OPERATORS: continue
    clz = list(mutation.findall('mutatedClass'))[0].text
    method = list(mutation.findall('mutatedMethod'))[0].text
    desc = list(mutation.findall('methodDescription'))[0].text
    line = list(mutation.findall('lineNumber'))[0].text
    index = list(mutation.findall('index'))[0].text #killingTests, succeedingTests
    print(clz, method, desc, line, mutator, index)
    #x=(mutation.attrib)
#    z=list(x)
#    for i in z:
#        print(x[i])
