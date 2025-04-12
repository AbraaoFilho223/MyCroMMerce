FROM maven:3.9.6-eclipse-temurin-17 AS build
WORKDIR /app
COPY . .

FROM eclipse-temurin:17-jdk-alpine
WORKDIR /app
COPY --from=build /app/target/payment-service-*.jar payment-service.jar
EXPOSE 8085
CMD ["java", "-jar", "payment-service.jar"]
