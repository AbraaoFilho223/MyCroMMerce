FROM eclipse-temurin:17-jdk-alpine
WORKDIR /app
COPY target/order-service-DEF.jar /app/order-service.jar
EXPOSE 8082
CMD ["java", "-jar", "/app/order-service.jar"]
