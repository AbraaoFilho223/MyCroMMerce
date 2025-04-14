FROM maven:3.9.6-eclipse-temurin-17 AS build
WORKDIR /build
COPY . .
RUN mvn package -DskipTests -pl product-service -am

FROM eclipse-temurin:17-jdk-alpine
WORKDIR /app
COPY --from=build /build/product-service/target/*.jar app.jar
EXPOSE 8080
CMD ["java", "-jar", "app.jar"]
