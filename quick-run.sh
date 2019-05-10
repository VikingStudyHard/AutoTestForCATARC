mvn clean
mvn install -Dmaven.test.skip=true
cd AutoTestForCATARC-ELV
mvn test