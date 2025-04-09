FROM eclipse-temurin:17-jdk-alpine
WORKDIR /app
COPY target/user-service-DEF.jar /app/user-service.jar
EXPOSE 8083
CMD ["java", "-jar", "/app/user-service.jar"]
