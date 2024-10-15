FROM openjdk:17-jdk-slim

WORKDIR /app

COPY target/products-0.0.1-SNAPSHOT.jar revshopd.jar

EXPOSE 8081

ENTRYPOINT ["java", "-jar", "revshopd.jar"]