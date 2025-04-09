FROM eclipse-temurin:17-jdk-alpine
WORKDIR /app
COPY target/payment-service-DEF.jar /app/payment-service.jar
EXPOSE 8084
CMD ["java", "-jar", "/app/payment-service.jar"]
