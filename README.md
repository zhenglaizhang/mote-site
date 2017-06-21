# Motel Site

## What's inside
This project is based on the [Spring Boot](http://projects.spring.io/spring-boot/) project and uses these packages :
- Maven
- Spring Core
- Spring Data (Hibernate & MySQL)
- Spring MVC (Tomcat)
- [Thymleaf](www.thymeleaf.org)

## Installation

```
mvn spring-boot:run
```


## Database configuration 
Create a MySQL database with the name `springbootdb`and add the credentials to `/resources/application.properties`.  
The default ones are :

```
spring.datasource.url=jdbc:mysql://localhost:3306/springbootdb
spring.datasource.username=root
spring.datasource.password=
spring.jpa.hibernate.ddl-auto=update
```

## Usage 
Run the project and head out to [http://localhost:8080](http://localhost:8080)
