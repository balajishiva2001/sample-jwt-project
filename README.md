# 📝 Sample JWT Project

A simple Spring Boot application demonstrating JSON Web Token (JWT) authentication and authorization.  
Secure your REST APIs using JWT with Spring Security, Java 17, and Maven.

---

## 🔧 Features

- 🔐 User authentication with JWT tokens  
- 🔒 Role-based access control for protected endpoints  
- ⚙️ Secure REST API endpoints  
- 🚀 Built using Spring Boot for rapid development  

---

## 📦 Tech Stack

- Backend: Java 17 & Spring Boot  
- Security: Spring Security with JWT  
- Build Tool: Maven  

---

## 🛠️ Setup Instructions

### 1️⃣ Prerequisites

Make sure you have the following installed:

- ☕ Java 17 — https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html  
- 📦 Maven — https://maven.apache.org/install.html  
- 🖥️ Your favorite IDE (IntelliJ IDEA, VS Code, etc.)  
- 🔧 Git — https://git-scm.com/downloads  

---

### 2️⃣ Clone the Repository

git clone https://github.com/balajishiva2001/sample-jwt-project.git  
cd sample-jwt-project

---

### 3️⃣ Build the Project

Using Maven Wrapper:

./mvnw clean install

Or Maven directly:

mvn clean install

---

### 4️⃣ Run the Application

Start the Spring Boot server:

./mvnw spring-boot:run

Or:

mvn spring-boot:run

Access the app at: http://localhost:8080

---

### 5️⃣ API Endpoints

Method | Endpoint          | Description                      
-------|-------------------|--------------------------------
POST   | /api/auth/login   | Authenticate user and get JWT   
GET    | /api/user/profile | Access protected user profile   

> Note: Protected endpoints require the `Authorization: Bearer <JWT>` header.

---

### 6️⃣ (Optional) Run Tests

./mvnw test

Or:

mvn test

---

## 📂 Project Structure

sample-jwt-project/  
├── src/  
│   ├── main/  
│   │   ├── java/com/example/demo/    # Source code: controllers, services, security configs  
│   │   ├── resources/                # Config files (application.properties)  
│   └── test/                        # Test cases  
├── mvnw                            # Maven wrapper scripts  
├── pom.xml                        # Maven build file  
└── README.md                      # This file  

---

## 📌 Future Improvements

- ➕ Add user registration and profile management  
- 🔒 Enhance security with refresh tokens  
- 📚 Add Swagger UI for API documentation  
- ⚙️ Integrate OAuth2 login  

---

## 🤝 Contributing

Contributions are welcome! Feel free to fork, create branches, and submit pull requests.  
Let’s build secure and scalable applications together! 🚀

---

## 📜 License

This project is licensed under the MIT License. See the LICENSE file for details.

---

## 🙋 Author

Balaji Shiva  
GitHub: https://github.com/balajishiva2001
