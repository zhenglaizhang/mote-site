# Motel Site

## What's inside
This project is based on the [Spring Boot](http://projects.spring.io/spring-boot/) project and uses these packages :
- Maven
- Spring Core
- Spring Data (Hibernate & MySQL)
- Spring MVC (Tomcat)
- [Thymleaf](www.thymeleaf.org)
- [Navbar](https://bootsnipp.com/snippets/featured/fancy-sidebar-navigation)

## Installation

- local
```
sudo pacman -S mariadb
mysql_install_db --user=mysql --basedir=/usr --datadir=/var/lib/mysql
sudo systemctl start mariadb.service
mysql_secure_installation # set root password as `1234` ( todo: use safer way)
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
- http://jvmhub.com/2015/08/02/spring-boot-with-thymeleaf-tutorial-part-2-forms-with-validation/
- file uploading
- auth login
- update customer
- gradle support
- docker integration

```
export JAVA_OPTS=-Xmx1024m -XX:MaxPermSize=128M
gradle bootRun
```
