FROM adoptopenjdk/openjdk11:latest
EXPOSE 8080
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} helloworld-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/helloworld-0.0.1-SNAPSHOT.jar"]

