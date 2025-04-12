FROM maven:3.9.6-eclipse-temurin-17 AS build
WORKDIR /app
COPY . .

FROM eclipse-temurin:17-jdk-alpine
WORKDIR /app
COPY --from=build /app/target/user-service-*.jar user-service.jar
EXPOSE 8083
CMD ["java", "-jar", "user-service.jar"]
