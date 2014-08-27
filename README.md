Vaadin + Spring-MVC + Spring-Boot
=================================

The sample project shows how to run a vaadin application with multiple UIs in combination with the good old spring web mvc. The spring web sevlet uses Thymeleaf and templates to render the HTML output. It can be started simply as a standalone application that already contains its own web server. (Thanks to spring-boot, that was long overdue!)

## Quick start ##

### Install vaadin4spring into your local repository ###

1. Clone the vaadin4spring repository: ```$ git clone https://github.com/peholmst/vaadin4spring.git```
2. Change into the root directory of the working copy and run: ```mvn clean install```

### Run this demo ###

1. Clone this repository: ```$ git clone https://github.com/rwe17/spring-boot-vaadin-demo.git```
2. Change into the root directory of the working copy and run: ```mvn clean spring-boot:run```

## Have a look into my block ##

Have a look at http://rwehner.wordpress.com/2014/08/26/combining-vaadin-and-classic-spring-mvc-into-one-simple-spring-boot-application/ which contains more information about this demo code.

## Only test the executable jar? ##

You can download the complete [vaadin-demo-0.0.1-SNAPSHOT.war](https://s3.amazonaws.com/rwe-public/vaadin-demo-0.0.1-SNAPSHOT.war) and start it with ```java -jar vaadin-demo-0.0.1-SNAPSHOT.war``.

