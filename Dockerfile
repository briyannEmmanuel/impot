FROM openjdk:17-jdk-slim

LABEL maintainer="Juste mbriyann01@gmail.com"

ADD target/impot-0.0.1.jar impot.jar

WORKDIR /app/data

ENTRYPOINT ["java", "-jar", "impot.jar"]