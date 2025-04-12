FROM maven:3.9.6-eclipse-temurin-17 AS build
WORKDIR /app
COPY . .

FROM eclipse-temurin:17-jdk-alpine
WORKDIR /app
COPY --from=build /app/target/order-service-*.jar order-service.jar
EXPOSE 8084
CMD ["java", "-jar", "order-service.jar"]
