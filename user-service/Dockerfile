FROM maven:3.9.6-eclipse-temurin-17 AS build
WORKDIR /build
COPY . .
# RUN mvn clean package -DskipTests -pl user-service -am
RUN mvn package

FROM eclipse-temurin:17-jdk-alpine
WORKDIR /app
COPY --from=build /build/user-service/target/*.jar app.jar
EXPOSE 8080
CMD ["java", "-jar", "app.jar"]
