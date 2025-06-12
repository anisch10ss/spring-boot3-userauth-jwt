# spring-boot3-userauth-jwt

## 🔐 JWT-Based Authentication with Spring Boot 3

This project implements **user authentication and authorization** using **Spring Boot 3**, **Spring Security**, and **JSON Web Tokens (JWT)**. It provides secure login, registration, role-based access control, and token refresh endpoints — forming the authentication backbone of the **WiseVision retail analytics platform**.

---

## ✨ Features

- ✅ User registration and login
- 🔐 JWT access & refresh token system
- 👥 Role-based access control (e.g., ADMIN, USER)
- 🔄 Token refresh endpoint
- 📄 Spring Security filters for request validation
- 📁 Clean, layered architecture

---

## 🧱 Tech Stack

| Layer       | Technology              |
|-------------|--------------------------|
| Framework   | **Spring Boot 3**        |
| Security    | **Spring Security 6**    |
| JWT         | **jjwt (JSON Web Tokens)** |
| Database    | **H2 / PostgreSQL** *(configurable)* |
| Build Tool  | **Maven**                |

---

## 🏗️ Project Structure
src/
├── config/ # Security & JWT configs
├── controller/ # Auth endpoints
├── dto/ # Request/Response models
├── entity/ # User, Role entities
├── repository/ # Spring Data JPA repositories
├── service/ # Business logic
└── JwtAuthApplication.java

