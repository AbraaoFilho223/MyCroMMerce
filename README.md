# 🛒 MyCroMMerce

**MyCroMMerce** is a modular, microservices-based backend system for an e-commerce platform, designed to showcase scalable architecture and clean code practices using modern Java technologies.

Each microservice is isolated by domain and communicates via REST APIs through an API Gateway. This architecture promotes separation of concerns, easy maintainability, and future scalability.

---

## 🧩 Microservices Overview

### 1. Product Service 📦
- Manages product catalog and inventory.
- Supports CRUD operations on products.

### 2. Order Service 🧾
- Manages order placement, tracking, and pricing.
- Integrates with Product and Payment services.

### 3. User Service 👤
- Handles user registration and profile management.
- (JWT Authentication to be added soon).

### 4. Payment Service 💳
- Simulates payment processing logic.
- Designed for future integration with real payment providers.

### 5. API Gateway 🚪
- Central entry point for routing external traffic.
- Applies routing and request forwarding.

---

## ⚙️ Tech Stack

- **Language:** Java 17
- **Framework:** Spring Boot 3
- **Architecture:** REST Microservices
- **API Gateway:** Spring Cloud Gateway
- **Database:** In-memory H2 (demo-friendly)
- **Build Tool:** Maven (multi-module)
- **API Docs:** Swagger/OpenAPI

---

## ✅ Prerequisites

To run this project locally, you only need:

- **Java 17** → Check with: `java -version`
- **Maven 3.9+** → Check with: `mvn -version`

> 📝 You **do not need Docker or PostgreSQL** – everything runs with in-memory databases.

---

## ▶️ Running Locally

Each service is self-contained. Once cloned, you can run the microservices individually from your terminal or IDE.

> ⚠️ Working on a professional launcher to automate all service startups!

---

## 📚 API Documentation (Swagger)

Each service exposes Swagger documentation:

- **Product Service:** http://localhost:8081/swagger-ui.html
- **Order Service:** http://localhost:8082/swagger-ui.html
- **User Service:** http://localhost:8083/swagger-ui.html
- **Payment Service:** http://localhost:8084/swagger-ui.html
- **API Gateway:** http://localhost:8080/swagger-ui.html

---

## 📂 Project Structure (Monorepo)

```
MyCroMMerce/
├── api-gateway
├── order-service
├── payment-service
├── product-service
├── user-service
└── pom.xml (parent)
```

Each folder contains a Spring Boot service with its own child `pom.xml`.

---

## 📜 License

Licensed under the **MIT License** — you are free to use, modify, and distribute.

---

🚀 Feel free to explore, fork, and contribute to the project!
