FROM amazoncorretto:11-alpine-jdk
MAINTAINER LS
COPY target/ls-0.0.1-SNAPSHOT.jar ls-app.jar
ENTRYPOINT ["java","-jar","/ls-app.jar"]
