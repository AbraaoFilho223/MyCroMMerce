FROM eclipse-temurin:17-jdk-alpine
WORKDIR /app
COPY target/product-service-DEF.jar /app/product-service.jar
EXPOSE 8081
CMD ["java", "-jar", "/app/product-service.jar"]
