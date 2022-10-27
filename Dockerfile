FROM adoptopenjdk/openjdk8:alpine-jre
ADD target/spring-postgres-docker-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","app.jar"]