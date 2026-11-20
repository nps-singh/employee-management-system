# Employee Management System

A RESTful Employee Management System built with Java 17, Spring Boot, Spring Data JPA, Hibernate and MySQL.

## Features

- Create an employee
- List all employees
- Get an employee by ID
- Update employee details
- Delete an employee
- Search employees by name
- Filter employees by department
- Request validation and basic API error handling

## Technology stack

- Java 17
- Spring Boot 3.5.7
- Spring Web
- Spring Data JPA / Hibernate
- MySQL 8
- Maven

## Prerequisites

- JDK 17
- MySQL 8
- Maven (or use the included Maven Wrapper if you add one)
- Eclipse IDE / Spring Tool Suite

## Database setup

Create the database in MySQL Workbench:

```sql
CREATE DATABASE employee_management;
```

## Configure database credentials

The application reads credentials from environment variables. Defaults are:

- `DB_URL`: `jdbc:mysql://localhost:3306/employee_management?createDatabaseIfNotExist=true&useSSL=false&serverTimezone=UTC`
- `DB_USERNAME`: `root`
- `DB_PASSWORD`: empty by default

Set `DB_PASSWORD` in your run configuration or operating-system environment. Do not commit real passwords to GitHub.

## Run the application

From the project directory:

```bash
mvn spring-boot:run
```

Or import as **Existing Maven Project** in Eclipse, wait for Maven dependencies to download, then run `EmployeeManagementApplication.java` as **Java Application**.

Base URL: `http://localhost:8080`

## API endpoints

| Method | Endpoint | Description |
|---|---|---|
| POST | `/api/employees` | Create employee |
| GET | `/api/employees` | Get all employees |
| GET | `/api/employees/{id}` | Get employee by ID |
| PUT | `/api/employees/{id}` | Update employee |
| DELETE | `/api/employees/{id}` | Delete employee |
| GET | `/api/employees/search?name=amit` | Search by name |
| GET | `/api/employees/department/IT` | Filter by department |

### Example request: create employee

```json
{
  "name": "Amit Kumar",
  "email": "amit@example.com",
  "department": "IT",
  "salary": 55000
}
```

Use Postman or another REST client to test the APIs.

## GitHub upload

Upload the project source code and README. Do not upload `target/`, IDE metadata, database dumps, or real credentials.
