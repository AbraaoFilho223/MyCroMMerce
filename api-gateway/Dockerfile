FROM eclipse-temurin:17-jdk-alpine
WORKDIR /app
COPY target/api-gateway-DEF.jar /app/api-gateway.jar
EXPOSE 8080
CMD ["java", "-jar", "/app/api-gateway.jar"]
