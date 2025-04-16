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
- Handles user registration and profile management. **[WIP]**

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
- **Operating System:** **Linux is required** for full compatibility and Docker integration  
  - ⚠️ **Windows is not fully supported.** You can run services individually on Windows using:
    ```bash
    mvn spring-boot:run
    ```
    But full Docker Compose integration is designed for Linux environments.

> 📝 You **do not need PostgreSQL** – everything runs with an internal H2 database. Docker integration is included, but it is designed for Linux.

---

## ▶️ Running Locally

Each service is self-contained. Once cloned, you can run the microservices individually or through Docker on a Linux system. **[Run with Sudo]**

### Steps to run the project with Docker:

1. **Clone the repository:**
    ```bash
    git clone https://github.com/AbraaoFilho223/MyCroMMerce.git
    ```

2. **Navigate to the project directory:**
    ```bash
    cd MyCroMMerce
    ```

3. **Build the Docker containers:**
    ```bash
    docker compose up --build
    ```

    This will build and start all the microservices in the project, including the internal H2 database, and the system will be accessible locally.

> ⚠️ **Note:** Docker integration is designed for Linux. You can use individual services on Windows, but the full Docker Compose setup is optimized for Linux environments.

---

## ⏳ Build Time

Building the project might take some time, especially the first time you run it, due to the following reasons:

- **First build**: If you're running the project for the first time or after running `mvn clean`, Maven will rebuild all the dependencies and packages.
- **Number of modules**: The project contains multiple modules, so Maven may need to resolve and build them all, even if you're only building one module like `api-gateway`.
- **Docker integration**: Running the build inside Docker might increase build time due to the container environment and resource constraints.
- **Machine resources**: The build time can also vary depending on the available resources (CPU, memory) on your machine.

If the build seems to take too long, you may want to consider optimizing your Docker setup or using multi-core processors to speed up the build process.

---

## 🔎 How to Test the Project

After running `docker compose up`, you can test each microservice individually using your browser or a REST client (like Postman or Insomnia). Swagger UI has been temporarily disabled for simplicity.

### 🧪 Test Endpoints Directly (No Auth Required)

You can access each service directly through its own port and path:

| Microservice       | Port   | Endpoint Example                         |
|--------------------|--------|------------------------------------------|
| Product Service    | 8081   | `http://localhost:8081/api/product/...`  |
| Order Service      | 8082   | `http://localhost:8082/api/order/...`    |
| User Service       | 8083   | `http://localhost:8083/api/user/...`     |
| Payment Service    | 8084   | `http://localhost:8084/api/payment/...`  |

> ✅ These routes are public and do **not require authentication**.

### 🌐 Test via API Gateway (Auth Required)

You can also access all services through the API Gateway:

- URL format: `http://localhost:8080/api/{service}/...`  
  (e.g., `http://localhost:8080/api/product/list`)

To use the API Gateway, authentication is **required**. Use the credentials below to log in:

- **Username:** `admin`  
- **Password:** `password`

> 🔒 All routes through the API Gateway are protected by Basic Authentication.

---

## 📂 Project Structure (Monorepo)

```
MyCroMMerce/
├── api-gateway
├── mycro-frontend (simple frontend)
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
