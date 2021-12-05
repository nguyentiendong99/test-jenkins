FROM openjdk:11
EXPOSE 8080
ADD target/test-jenkins.jar test-jenkins.jar
ENTRYPOINT ["java","-jar","/test-jenkins.jar"]