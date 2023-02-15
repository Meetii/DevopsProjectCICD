FROM openjdk:17-alpine
ADD target/*.jar Devops-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar", "Devops-0.0.1-SNAPSHOT.jar"]
