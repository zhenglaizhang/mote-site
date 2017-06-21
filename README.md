# Motel Site

## What's inside
This project is based on the [Spring Boot](http://projects.spring.io/spring-boot/) project and uses these packages :
- Maven
- Spring Core
- Spring Data (Hibernate & MySQL)
- Spring MVC (Tomcat)
- [Thymleaf](www.thymeleaf.org)

## Installation

- start local
```
export MAVEN_OPTS=-Xmx1024m -XX:MaxPermSize=128M
mvn spring-boot:run
```
- navigate to http://localhost:8080
- perform any updates and compile it through `mvn compile` or `Ctrl + F9` (Intellij), springloaded loads new class files
- refresh related page

(or you could turn on Intellij `Settings -> Build project automatically` feature)

## Database configuration 
Create a MySQL database with the name `motel`and add the credentials to `/resources/application.properties`.
The default ones are :

```
spring.datasource.url=jdbc:mysql://localhost:3306/motel
spring.datasource.username=root
spring.datasource.password=
spring.jpa.hibernate.ddl-auto=update
```

## TODO

- template
- file uploading
- auth login
- update customer
- gradle support
- docker integration

```
export JAVA_OPTS=-Xmx1024m -XX:MaxPermSize=128M
gradle bootRun
```
