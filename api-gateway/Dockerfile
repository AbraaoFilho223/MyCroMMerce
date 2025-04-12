FROM maven:3.9.6-eclipse-temurin-17 AS build
WORKDIR /app
COPY . .

FROM eclipse-temurin:17-jdk-alpine
WORKDIR /app
COPY --from=build /app/target/api-gateway-*.jar api-gateway.jar
EXPOSE 8080
CMD ["java", "-jar", "api-gateway.jar"]
