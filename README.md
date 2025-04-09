# E-Commerce Backend (Microservices)

## 📌 Overview
MyCroMMerce is a scalable, microservices-based backend system for an e-commerce platform. This project is designed to demonstrate **modern backend architecture** using **Spring Boot** and **microservices**, enabling modularity, scalability, and flexibility.

Each microservice in this system is responsible for a specific domain function, ensuring **loose coupling** and **high cohesion** while following best practices in software development.

## 🏗️ Architecture
The system consists of multiple independent microservices that communicate via REST APIs and, optionally, an event-driven messaging system.

### **Microservices Overview**
1. **Product Catalog Service** 📦  
   - Manages product inventory and details.
   - Provides APIs for retrieving, adding, updating, and deleting products.
   - Uses **PostgreSQL** for data persistence.

2. **Order Management Service** 📜  
   - Handles order creation, tracking, and processing.
   - Communicates with the **Product Catalog** and **Payment Gateway**.

3. **User Service** 👤  
   - Manages user authentication, registration, and profiles.
   - Implements **JWT-based authentication** for security.

4. **Payment Gateway Service** 💳  
   - Simulates or integrates with a third-party payment provider.
   - Ensures transactions are securely processed.

5. **API Gateway** 🔀  
   - Routes external requests to the appropriate microservices.
   - Provides centralized authentication and security enforcement.

### **Tech Stack** 🛠️
- **Language:** Java 17 (Spring Boot 3)
- **Database:** PostgreSQL (Relational Data)
- **Containerization:** Docker & Kubernetes
- **Security:** JWT Authentication
- **Cloud Deployment:** AWS (EC2, RDS, S3)
- **Inter-Service Communication:** REST APIs (Future: Kafka/RabbitMQ)
- **CI/CD:** GitHub Actions (for automated builds & deployments)

---

## 🚀 Getting Started
### **Prerequisites**
Make sure you have the following installed:
- **Java 17** → `java -version`
- **Maven** → `mvn -version`
- **PostgreSQL** (or use Docker for DB setup)
- **Docker & Docker Compose** → `docker --version`
- **Git** → `git --version`

### **Clone the Repository**
```sh
 git clone https://github.com/AbraaoFilho223/MyCroMMerce-ecommerce-backend-microservices.git
 cd MyCroMMerce-ecommerce-backend-microservices
```

### **Run Locally using Docker Compose**
```sh
docker-compose up --build
```
The API Gateway will be available at `http://localhost:8080/`.

### **Manual Startup (Without Docker)**
If you prefer to run services manually:
1. Start PostgreSQL.
2. Open a terminal and run the following command for each microservice:
   ```sh
   mvn spring-boot:run
   ```

---

## 📖 API Documentation
Each microservice exposes REST APIs. You can access API documentation using **Swagger**:
- **Product Service:** `http://localhost:8081/swagger-ui.html`
- **Order Service:** `http://localhost:8082/swagger-ui.html`
- **User Service:** `http://localhost:8083/swagger-ui.html`
- **Payment Service:** `http://localhost:8084/swagger-ui.html`
- **API Gateway:** `http://localhost:8080/swagger-ui.html`

---

## 📜 License
This project is **MIT Licensed** - you are free to use, modify, and distribute it.

---

🎯 **Contributions, issues, and feature requests are welcome!** Feel free to fork and submit a PR. 🚀
=======
# MyCroMMerce
Scalable e-commerce backend using Java microservices (Spring Boot, Docker, PostgreSQL)
>>>>>>> 1370a46e787aa4435628927efd019dd595d5396b
