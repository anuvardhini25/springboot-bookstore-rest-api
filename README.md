# Spring Boot BookStore REST API

A simple RESTful API built using Spring Boot and MySQL for managing books.

## Features

- Add new books
- Get all books
- Update existing books
- Delete books
- MySQL database integration
- RESTful architecture

---

## Tech Stack

- Java
- Spring Boot
- Spring Data JPA
- MySQL
- Maven
- Postman

---

## Project Structure

src/main/java/com/example/bookstoreapi
│
├── controller
├── model
├── repository
├── service
└── BookstoreapiApplication.java

---

## API Endpoints

### Get All Books

GET /api/books

### Add Book

POST /api/books

### Update Book

PUT /api/books/{id}

### Delete Book

DELETE /api/books/{id}

---

## Sample JSON

{
"title": "Atomic Habits",
"author": "James Clear",
"price": 499
}

---

## Database Configuration

Update `application.properties`:

spring.datasource.url=jdbc:mysql://localhost:3306/bookdb
spring.datasource.username=root
spring.datasource.password=YOUR_PASSWORD

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

---

## Run Project

### Clone Repository

git clone https://github.com/anuvardhini25/springboot-bookstore-rest-api.git

### Open Project

Open in IntelliJ IDEA or VS Code

### Run Application

mvn spring-boot:run

Server runs at:

http://localhost:8080

---

## Testing APIs

Use Postman to test:
- POST
- GET
- PUT
- DELETE

---

## Author

Anuvardhini T
