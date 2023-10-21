# Base image
FROM openjdk:11-jdk

# Working directory
WORKDIR /app

COPY . /app

RUN ./mvnw package

EXPOSE 8080

CMD ["java", "-jar", "target/your-spring-app.jar"]
