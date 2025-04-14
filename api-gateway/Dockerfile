FROM maven:3.9.6-eclipse-temurin-17 AS build
WORKDIR /build
COPY . .
RUN mvn clean package -DskipTests -pl api-gateway -am

FROM eclipse-temurin:17-jdk-alpine
WORKDIR /app
COPY --from=build /build/api-gateway/target/api-gateway-1.0.0.jar app.jar
EXPOSE 8080
CMD ["java", "-jar", "app.jar"]
