FROM openjdk:20

ARG JAR_FILE=build/libs/spring-docker-esearch-0.0.1.jar

ADD $JAR_FILE spring-docker-esearch.jar

ENTRYPOINT ["java", "-jar", "spring-docker-esearch.jar"]