## Spring
- Spring is an open-source lightweight framework widely used to develop simple, reliable and scalableenterprise Solutions.
- The most important feature of the spring is dependency injection.
- It helps us to create a loosely coupled application.
- To run spring application, we need to set the server explicitly.
- To run spring application, a deployment descriptor is required.
- It does not support for an in-memory database.
- Developers have to define dependencies manually in the pom file.

## SpringBoot
- SpringBoot is built on the top of the conventional spring framework, widely used to REST API's
- It provides all the features of Spring and is easier to use than spring.
- SpringBoot is a microservice-based framework and makes production ready applications in very less time.
- It allows us layered architecture in which each layer communicates to other layers.
- The most import feature of spring boot is autoconfiguration.
- It helps to create a standalone application.
- SpringBoot provides embedded servers like tomcat and jetty.
- There is no requirement for a deployment descriptors.
- It provides support for an in-memory database such as H2.
- pom file internally handles the required dependency.

## Spring Boot layers
- ### Presentation layer
  - It's a top layer of spring boot architecture.
  - It consists of views, i.e., the frontend part of the application.
  - It handles HTTP requests and performs authentication.
  - It is responsible for converting the JSON fields parameter to a java object and vice versa.

- ### Business layer:
  - It contains all business logic.
  - It consists services of classes.
  - It is responsible for validation and authorization.

- ### Persistence layer:
  - It contains all the database storage logic.
  - It is responsible for converting businees object to the database row and vice versa.

- ### Database layer:
  - The DB layer contains all the databases such as MYSQl, MONGODB, etc.
  - The layer contains multiple DB.
  - It's responsible for CRUD operations.

## Spring Boot Actuator
- It is used to monitor and manage your spring boot application.
- By /actuator and /actuator/heath endpoints you can achieve the above goals.
- You can change the default endpoint by adding the following in application.properties file
  - management.endpoints.web.base-path = /details
- ### Advantages
  - It increases customer satisfaction
  - It reduces downtime.
  - It boosts productivity.
  - It improves Cybersecurity management.
  - It increases the conversion rate.


