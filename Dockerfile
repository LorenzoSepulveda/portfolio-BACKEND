FROM amazoncorretto:11-alpine-jdk
MAINTAINER LS
COPY target/ls-0.0.1-SNAPSHOT.jar ls-app.jar
EXPOSE 808
ENTRYPOINT ["java","-jar","/ls-app.jar"]
