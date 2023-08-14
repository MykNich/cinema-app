
# 🎥 Cinema-App Project

## 📜 Summary:
Cinema-App is a REST web application for managing cinema purchases, providing registration, authentication, and authorization functionalities for users. The application allows users to select movies, cinema halls, and movie sessions, add them to the shopping cart, and create orders based on their selections.

## 📃 Functionality:

This application provides several key features:
- Registration and authentication of users.
- Authorization of users based on roles (ADMIN or USER).
- Viewing a list of available movies, cinema halls, and movie sessions.
- Selecting movies, cinema halls, and movie sessions and adding them to the shopping cart.
- Creating orders based on the content of the shopping cart.
- For ADMIN role it is interaction with the database for storing and retrieving information about movies, cinema halls, and movie sessions.

## 📁 Project Structure:

![entity_relations](relations.png)

`/src/main/java/cinema` - contains the entire source code of the program:
- `/config`: Configuration files.
- `/controller`: Controllers to handle HTTP requests.
- `/dao`: Data Access Object - interactions with the database.
- `/dto`: Data Transfer Object - objects for data transfer.
- `/exception`: Custom exceptions and error handling classes.
- `/lib`: Custom validators.
- `/model`: Data model - entities representing database tables.
- `/security`: Classes related to security.
- `/service`: Business logic and services.
- `/util`: Utility classes.

`/src/main/resources` - contains properties for connecting to the database

## 💡 Technologies Used:

- Java
- Spring Framework (Spring Web, Spring Security)
- Hibernate
- Maven
- MySQL
- Tomcat

## 🚀 Running the Project:

1. **Clone the repository**:

2. **Set up the database**:
    - Install MySQL and create a new database.
    - Modify the database connection properties in the `src/main/resources/db.properties` file to match your database configuration. Update database connection settings:
        - `YOUR_DRIVER`: Ensure that you have the appropriate JDBC driver for MySQL configured in your project.
        - `YOUR_DATABASE_URL`: The URL of your MySQL database.
        - `YOUR_USERNAME`: The username for accessing your MySQL database ('root' by default).
        - `YOUR_PASSWORD`: The password for accessing your MySQL database.

3. **Configure Database Connection**:
    - Open the project in your Integrated Development Environment (IDE).

4. **Download Apache Tomcat**:
    - Download Apache Tomcat version 9.x.x from the official Apache Tomcat website: [https://tomcat.apache.org/download-90.cgi](https://tomcat.apache.org/download-90.cgi).
    - Choose the appropriate installation package for your operating system.

5. **Deploy the application**:
    - Edit Tomcat configuration in 'Select Run/Debug Configuration' window in your IDE.
    - Add configuration 'Tomcat -> Local'.
    - Chose 'Fix' button and  select 'cinema-app:war exploded' option. You can change Application context to just `/`.
    - Start the Tomcat server.

6. **Access the application**:
    - Open a web browser and go to `http://localhost:8080/` to access the application.
    - Use Postman to send requests.

