# Spring-Security-Implementation--JWT
Complete Spring Security implementation with Spring Boot including Authentication, Authorization, JWT, BCrypt, CSRF, Database Authentication, and OAuth2 (Google &amp; GitHub Login).

# 🔐 Spring Security - Complete Learning Journey

A complete hands-on implementation of **Spring Security** with **Spring Boot** covering authentication, authorization, password encryption, JWT authentication, database integration, CSRF protection, and OAuth2 login (Google & GitHub).

This repository contains all the code developed while learning Spring Security from beginner to intermediate level.

---

## 📚 Course Topics Covered

### ✅ 1. Spring Security Getting Started
- Introduction to Spring Security
- Default authentication
- Understanding the Security Filter Chain
- Default login page
- Securing REST APIs

---

### ✅ 2. Setting Our Own Username and Password
- In-memory authentication
- Custom username and password
- UserDetails
- UserDetailsService
- Authentication basics

---

### ✅ 3. CSRF Token
- What is CSRF?
- How CSRF attacks work
- CSRF Token generation
- Enabling and disabling CSRF
- Testing secured APIs with Postman

---

### ✅ 4. Spring Security Configuration
- SecurityFilterChain
- HttpSecurity configuration
- Request authorization
- Public vs Protected endpoints
- Authentication Manager
- PasswordEncoder

---

### ✅ 5. Spring Security User from Database
- User Entity
- User Repository
- Loading users from MySQL
- Custom UserDetailsService
- Database Authentication
- Role Management

---

### ✅ 6. BCrypt Password Encoder
- Password hashing
- BCrypt algorithm
- Secure password storage
- Password verification

---

### ✅ 7. What is JWT and Why?
- Introduction to JWT
- Stateless Authentication
- JWT Structure
    - Header
    - Payload
    - Signature
- Advantages of JWT

---

### ✅ 8. Spring Security Project Setup for JWT
- JWT Project Structure
- Required Dependencies
- JWT Configuration
- Authentication Flow

---

### ✅ 9. Generating JWT Token
- JWT Utility Class
- Authentication Endpoint
- Token Generation
- Signing Tokens
- Expiration Time

---

### ✅ 10. Validating JWT Token
- JWT Authentication Filter
- Token Validation
- Extract Username
- Authenticate Every Request
- Security Context

---

### ✅ 11. Google & GitHub OAuth2 Login
- OAuth2 Authentication
- Google Login
- GitHub Login
- Client Registration
- Authorized Redirect URI
- OAuth2 Security Flow

---

# 🛠️ Technologies Used

- Java 21
- Spring Boot
- Spring Security
- Spring Data JPA
- Hibernate
- MySQL
- Maven
- JWT (JSON Web Token)
- BCrypt
- OAuth2
- Google OAuth
- GitHub OAuth
- Lombok
- Postman

---

# 📂 Project Structure

```
src
 ├── controller
 ├── entity
 ├── repository
 ├── service
 ├── security
 │     ├── jwt
 │     ├── filter
 │     ├── config
 │     └── UserDetailsServiceImpl
 ├── config
 └── resources
```

---

# 🚀 Features

- REST API Security
- Authentication
- Authorization
- Role Based Access
- JWT Authentication
- BCrypt Password Encryption
- Database Authentication
- Custom UserDetailsService
- OAuth2 Login
- Google Login
- GitHub Login
- CSRF Protection
- Stateless Authentication

---

# 🔑 Concepts Learned

- Spring Security Architecture
- Security Filter Chain
- Authentication vs Authorization
- UserDetailsService
- PasswordEncoder
- Security Context
- CSRF Protection
- JWT Authentication
- OAuth2 Authentication
- Role Based Authorization

---

# 🧪 Testing

The APIs were tested using:

- Postman
- Browser
- PostgreSQL Database

---

# 🎯 Learning Outcome

After completing this repository, I learned how to:

- Secure Spring Boot applications
- Implement Authentication & Authorization
- Connect Spring Security with Database
- Encrypt passwords using BCrypt
- Generate & Validate JWT Tokens
- Build Stateless Authentication APIs
- Configure Google & GitHub OAuth Login
- Protect REST APIs using Spring Security Best Practices

---

# 📌 Future Improvements

- Refresh Token Implementation
- Email Verification
- Forgot Password
- OTP Authentication
- Two-Factor Authentication (2FA)
- Role & Permission Management
- Refresh Token Rotation
- Redis Token Blacklisting
