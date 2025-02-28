Employee Management System

A comprehensive web application for managing employees, built with Spring Boot, Spring MVC, Spring Security, Thymeleaf, and MySQL.

 Features

- Employee Management: Create, read, update, and delete employee records.
- User Authentication: Secure login and registration using Spring Security.
- Pagination and Sorting: Efficiently navigate and organize employee data.
- Responsive Design: User-friendly interface with Thymeleaf templates.

 Technologies Used

- Backend:
  - [Spring Boot 3](https://spring.io/projects/spring-boot)
  - [Spring MVC](https://docs.spring.io/spring-framework/docs/current/reference/html/web.html)
  - [Spring Security 6](https://spring.io/projects/spring-security)
  - [Spring Data JPA (Hibernate)](https://spring.io/projects/spring-data-jpa)
  - [MySQL Database](https://www.mysql.com/)

- Frontend:
  - [Thymeleaf](https://www.thymeleaf.org/)
  - [Bootstrap](https://getbootstrap.com/) (optional for styling)

 Getting Started

 Prerequisites

- Java 17 or higher
- Maven 3.2+
- MySQL Database
- IDE: [Eclipse](https://www.eclipse.org/downloads/) or [Spring Tool Suite (STS)](https://spring.io/tools)

  
1. Clone the Repository:
   ```bash
   git clone https://github.com/your-username/employee-management-system.git
   cd employee-management-system
   ```
2. Configure the Database:
   - Create a MySQL database named `demo`.
   - Update `src/main/resources/application.properties` with your database credentials:
     ```properties
     spring.datasource.url=jdbc:mysql://localhost:3306/demo?useSSL=false&serverTimezone=UTC&useLegacyDatetimeCode=false
     spring.datasource.username=your-username
     spring.datasource.password=your-password
     spring.jpa.hibernate.ddl-auto=update
     ```

3. Build and Run the Application:
   ```bash
   mvn clean install
   mvn spring-boot:run
   ```
The application will be accessible at `http://localhost:8080/`.

   
Project Structure
```
src
├── main
│   ├── java
│   │   └── net.javaguides.springboot
│   │       ├── controller
│   │       ├── model
│   │       ├── repository
│   │       ├── service
│   │       └── SpringbootThymeleafCrudWebAppApplication.java
│   └── resources
│       ├── templates
│       │   ├── employees
│       │   │   ├── list.html
│       │   │   ├── add.html
│       │   │   └── edit.html
│       └── application.properties

```

- `controller`: Handles HTTP requests and responses.
- `model`: Contains entity classes representing the database tables.
- `repository`: Interfaces for CRUD operations with the database.
- `service`: Business logic and transaction management.
- `templates`: Thymeleaf templates for the views.

 Usage

1. Access the Application:
   - Navigate to `http://localhost:8080/` in your browser.

2. User Registration and Login:
   - Register a new account or log in with existing credentials.

3. Manage Employees:
   - Add new employees.
   - View a list of all employees with pagination and sorting.
   - Update employee details.
   - Delete employees as needed.

 Contributing

Contributions are welcome! Please fork the repository and submit a pull request for any enhancements or bug fixes.
