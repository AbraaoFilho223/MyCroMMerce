FROM maven:3.9.6-eclipse-temurin-17 AS build
WORKDIR /build
COPY . .
RUN mvn clean package -DskipTests -pl payment-service -am

FROM eclipse-temurin:17-jdk-alpine
WORKDIR /app
COPY --from=build /build/payment-service/target/payment-service-1.0.0.jar app.jar
EXPOSE 8080
CMD ["java", "-jar", "app.jar"]
