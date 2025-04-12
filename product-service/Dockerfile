FROM maven:3.9.6-eclipse-temurin-17 AS build
WORKDIR /app
COPY . .

FROM eclipse-temurin:17-jdk-alpine
WORKDIR /app
COPY --from=build /app/target/product-service-*.jar product-service.jar
EXPOSE 8082
CMD ["java", "-jar", "product-service.jar"]
