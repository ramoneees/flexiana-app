FROM openjdk:12-alpine

WORKDIR /app

COPY   target/backend.jar /app/

EXPOSE 8080

CMD ["java", "-jar", "backend.jar"]
