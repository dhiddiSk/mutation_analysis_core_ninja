export CLASSPATH=pitest-command-line-1.4.9.jar:target/dependency/*:evosuite-standalone-runtime-1.0.6.jar:pitest-1.4.9.jar:pitest-entry-1.4.9.jar:hamcrest-core-1.3.jar:junit-4.12.jar:target/classes/:target/test-classes/ &&\
java org.pitest.mutationtest.commandline.MutationCoverageReport \
--reportDir pitestReports \
--targetClasses org.apache.commons.csv.* \
--targetTests org.apache.commons.csv.* \
--sourceDirs src/main/java/org/apache/commons/csv, evosuite-tests/org/apache/commons/csv --outputFormats=XML --timestampedReports=false --fullMutationMatrix=true