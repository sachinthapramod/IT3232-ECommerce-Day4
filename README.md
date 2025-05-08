# IT3232-ECommerce-Day4 (2025-04-04)
A Spring Boot application that provides REST endpoints to manage student data for lk.ac.vau.fas.ict.

## Overview

This application provides a RESTful API for performing CRUD (Create, Read, Update, Delete) operations on student records. The API allows users to:

- Retrieve student information
- Add new students
- Update existing student records
- Delete student records

## Project Structure

The project follows a standard Spring Boot structure:

```
src/
├── main/
│   ├── java/
│   │   └── lk/
│   │       └── ac/
│   │           └── vau/
│   │               └── fas/
│   │                   └── ict/
│   │                       ├── Controller/
│   │                       │   └── AppController.java
│   │                       └── model/
│   │                           └── Student.java
│   └── resources/
│       └── application.properties
```

## API Endpoints

### Basic Endpoints

- `GET /app/msg`: Returns a test message "Hello Spring Boot!"
- `GET /app/age/{ag}`: Returns a message with the provided age

### Student Endpoints

- `GET /app/student`: Returns a sample student object
- `GET /app/students`: Returns all students as a map with registration numbers as keys
- `GET /app/students/{rg}`: Returns a specific student by registration number
- `POST /app/add`: Adds a new student
- `DELETE /app/students/{id}`: Deletes a student by registration number
- `PUT /app/update/{id}`: Updates a student by registration number

## Student Model

The `Student` class has the following properties:

- `regNo`: Student registration number (unique identifier)
- `name`: Student name
- `age`: Student age
- `course`: student course
- `gpa`: Student grade point average
