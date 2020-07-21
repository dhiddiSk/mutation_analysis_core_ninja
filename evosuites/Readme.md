# Mutation Analysis With Evosuites

## Requirements:
<!-- UL --> 
* [Evosuite 1.0.6](http://www.evosuite.org/), download [area](http://www.evosuite.org/downloads/)
* java8(The latest version of evosuite tool supports java8), 
* [PIT 1.4.9 commandline](https://pitest.org/quickstart/commandline/)(Because maven build tool is not fully supportive with evosuite tool), download [area](https://github.com/hcoles/pitest/releases)

* The experimental projects choosen for experiments are mentioned below in(Original directories) and all the projects use maven as their build 	  	support tool.


## Original directories

* commons-csv-1.7-RC1 a227a1e2fb61ff5f192cfd8099e7e6f4848d7d43
  commons-CSV

* commons-collections-4.4-RC1 cab58b3a8093a2f6b84f12783a3fb358747310f7
  commons-collections-commons-commons-collections-4.4

* commons-compress-1.18-RC1 b95d5cde4c68640f886e3c6802384fae47408a37
  commons-compress-1.18-RC1

* commons-configuration-2.5-RC1 dc00a04783ea951280ba0cd8318f53e19acb707f
  commons-configuration-commons-configuration-2.5-RC1

* commons-dbcp-2.6.0-RC1 3e7fca08d3585aa7cf70045ee3ed607cbaf04baa
  commons-dbcp-commons-dbcp-2.6.0

* commons-imaging-1.0-alpha1-RC3 6f04ccc2cf8c867298579c355c6d88fd74da3e7b
  commons-imaging-commons-imaging-1.0-alpha1-RC3

* commons-io-2.6-RC3 2ae025fe5c4a7d2046c53072b0898e37a079fe62
  commons-io-commons-io-2.6-RC3

* commons-lang: LANG_3_8_RC1 9801e2fb9fcbf7ddd19221e9342608940d778f8c
  commons-lang-LANG_3_8_RC1

* commons-math MATH_3_6_RC2 95a9d35e77f70ffc9bd5143880c236a760b42005
  commons-math-MATH_3_6_RC2

* commons-net NET_3_6 163fe46c019f5184016207c247cdff30ee740ecc
  commons-net-NET_3_6

## Evosuites generation and Mutation analysis:
<!-- OL --> 

1. Since maven is not supportive for test generation, commandline is used to generate evo-suites using EVOSUITE tool:

```bash
java -jar evosuite-1.0.6.jar -Dsearch_budget=60 -Dminimize=false -Dassertion_strategy=all -Duse_separate_classloader=false -target target/ classes
```

 <!-- UL --> 
  * Parameter "search budget" refers to the time for test generation and to deal with it, EvoSuite uses a fixed amount of time for test   		generation and stops generating tests once this time has been used up, by default this is 60 seconds. 
  * By default EvoSuite runs the generated test cases in a sandbox. Under this configuration the mutations performed by PITest have no effect 	 	and therefore the result is wrong. One solution is to disable this configuration by manually changing the parameter "separateClassLoader" 	from true (default value) to false.
  * Parameter "target" refers to the compiled classes of the source code for which the evosuites are generated using evosuite tool.

2. Similarly for the compilation we need several project specific dependencies on the class path. The below command downloads all those dependencies into an folder(locally).

```bash
mvn dependency:copy-dependencies
```
3. To execute those generated suites one can use the arguments(-target and -prefix) of the evosuites and this will run evosuites in a package sequentially. For the large projects these arguments are not recommended by the tool itself, and it encourages to go with maven, but as mentioned earlier maven is not fully supportive. 
In order to test(run) the generated suites automatically(and quickly), I make use of PIT tool. PIT Only starts mutation analysis when it has a green suites, by this it creates a log describing list of tests failed, then I simply eliminate those tests failed.

4. Command line used to run the mutation analysis using PIT command line tool can be found at location /evosuites/ProjectsAndResults/Project XYZ. 


## Mutation analysis using docker(for remote computation purpose).
<!-- UL --> 

* In this step the whole environment used above to generate evosuites and run mutation analysis is replicated inside the container.
<!-- OL --> 
1. Base image(Ubuntu:18.04) is used.
2. java-8 is installed inside the ubuntu base image and environmental values are configured.
3. All the files required to carry the mutation analysis are been copied inside the container.
4. When the container is started, command script(bash) is used to run the mutation analysis and it generates a report at certain location inside the container. IMPORTANT point to note here, since the generated results stored inside the container will be lost once the container is stopped, so it is very important to map to a location(locally) while starting the container in order to save the results. 



## Note(difference in results of mutation analysis(all mutators) obtained from traditional to evosuites(results/*))

<!-- OL -->

1. The no. of mutations(with default set of operators) of collection project from my side are 8335 and your's are 8307. The difference is due to 	my mistake, I have accidentally placed a copy of one evosuite-test file in src directory, which resulted in more number of mutations.
2.  In the imaging project I have generated(with default set of operators) 11,598 mutations, where as you have generated 11,578 mutations. The 		difference is due to the generation of duplicate mutants during my mutation analysis.


## Mutation analysis(default mutators) from eovuites in full matrix mode.

<!-- OL -->
1. Firstly mutation analysis is perfomed with default mutators in full matrix mode. Results are located at /Immortals/evosuites/    defaultMutatorsAndFullMatrixMode/mutations/
2. Then the obtained results in xml format are converted into matrix(Mutants * Tests) of 0's and 1's, where as 1's represent that particular mutant got killed from those test cases and 0's represents that the mutants are not killed from those test cases. Matrices can be found in location /Immortals/evosuites/defaultMutatorsAndFullMatrixMode/evoMatrices/
3. Finally the population is predicted using these matrices as input for every indivdual project. The predictions are located /Immortals/evosuites/defaultMutatorsAndFullMatrixMode/evoEstimations


## Observations during estimation of equivalent mutants using Lincoln Index estimator

<!-- OL -->

1. Total number of distinct mutants considered for analysis using default suites are 1016, which are generated using mvn.
2. For the second trial I have used PIT command line interface tool for mutation analysis because of an compatability issue with mvn and evosuites. In this case I was able to generate only 1012 similar mutants i.e. 4 mutants were not regenerated.
3. After reverification, 2 out of those 4 mutants can be regenerated using mvn.
4. Differences MVN vs CLI = 4 mutants were not regenerated out of 1016, where as MVN vs MVN = 2 mutants were not regenerated out of 1016 mutants.














