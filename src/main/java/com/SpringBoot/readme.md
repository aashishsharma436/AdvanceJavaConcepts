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
  - The DB layer contains all the databases such as MYSQL, MONGODB, etc.
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

## Spring IOC (Inversion of Control) Container
- It is the core of spring framework.
- It creates the objects, configures and assembles their dependency, managing their entire lifecycle.
- The container uses dependency injection to manage the components that make up the application.
- It gets the information about the object from the configuration(XML file) or java Annotations and java POJO classes.
- These Objects are called Beans.
- **There are two types of IOC containers.**
  - ### Bean Factory:
    - Bean factory loads the bean definations and dependency among bean based on a configuration file (XML) or the beans can be directly accessed when required using java configuration.
    - Bean factory does not support annotation bases configuration.
    
  - ### Application Context:
    - It is a sub interface of Bean Factory.
    - It is used when we are creating an enterprise level application or web application.
    - This uses all these types of configurations.
      - AnnotationConfigApplicationContext container
      - AnnotationConfigWebApplicationContext container
      - XmlWebApplicationContext Container
      - FileSystemXmlApplicationContext Container
      - ClassPathXmlApplicationContect Container

## Dependency Injection
- It is a programming technique in which an object or function receives other objects or functions that it requires, 
- as opposed to creating them internally. Dependency injection aims to separate the concerns of constructing objects and using them, leading to loosely coupled programs.
- It can be done via 2 types
  - **Constructor Dependency Injection:** the container will invoke a constructor with arguments each representing a dependency we want to set.
    - ```java
      @Configuration
      public class AppConfig {
    
          @Bean
          public Item item1() {
              return new ItemImpl1();
          }
    
          @Bean
          public Store store() {
              return new Store(item1());
          }
      }
      ```
  - **Setter Dependency Injection**
    - the container will call setter methods of our class after invoking a no-argument constructor or no-argument static factory method to instantiate the bean. Let’s create this configuration using annotations
    - ```java
      @Bean
      public Store store() {
          Store store = new Store();
          store.setItem(item1());
          return store;
      }
      ```

| Setter Dependency Injection                                                                                                                                       | Constructor Dependency Injection                                                                |
|-------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------------------------------------------------------------------------------------------|
| Poor Reliability                                                                                                                                                  | Good Reliability                                                                                |
| The bean must include the getter and setter methods for the properties                                                                                            | The bean clas must declare a matching constructor with arguments otherwise Bean creation exception will be thrown |
| Requries Addition of @Autowired Annotation above the setter in the code, hence it increases the coupling between the class and the Dependency injection container | Best in the case of loose coupling                                                              |
| Circular dependency or partial dependencies result with setter dependency injection because object creation happens before the injection                          | No scope for circular dependecy because dependencies are resolves before object creation itself.|
| Preferred option when properties are less and mutuable objects can be created                                                                                     | Preferred option when properties on the bean are more and immutable objects are important for application|

## Annotations
- ```@SpringBootApplication```: It combines 3 annotations ```@ComponentScan, @Configuration``` and ```@AutoConfiguration```
- ```@ComponentScan```: This annotation scans the component like ```@Component, @Service, @Repository``` in the package of annotated class and its sub-packages.
- ```@Configuration```: This annotation configures the bean and packages in the class path.
- ```@AutoConfiguration```: This annotation automatically configures beans in the class path and automatically scans the dependencies according to the application need.
- ```@Component```: This annotation is used to mark a class as a spring bean that will be managed by the spring container.
- ```@RestController```: This annotation is used to define a Restful Webservice Controller. It is a specialized version of ```@Controller``` annotation that includes the ```@ResponseBoody``` annotation by default.
- ```@RequestMapping```: This annotation is used to map the HTTP request to a specific method in the controller. It can be applied at the class level to define a base URL for all methods, or at method level to specify the specific URL mapping.
- ```@Controller```: To mark a class to act like as a controller, which handles the HTTP Requests.
- ```@ResponseBody```: It tells a controller that the object returned is automatically serialized in JSON and passed back into HttpResponse Object.
- ```@Service```: To mark a class as a service provider or as a Business Logic layer.
- ```@Bean```: It is applied on a method to specify that it returns a bean to be managed by Spring context.
- ```@EnableAutoConfiguration```: When we want to customize the autoconfiguration.
- ```@Transactional```: It indicated that the particular method should be executed within the context of the transaction. If the transaction becomes successful, then the changes made to the database are committed, If any transaction fails, all the changes made to that particular transaction can be rollback, and it will ensure that the database remains in a consistent state.
- ```@ControllerAdvice```: It is a specialization of the ```@Component``` annotation. It allows defining global exception handling logic that applies across multiple controllers. and Can also be used to define model attributes and bind them to multiple controllers.
- ```@ExceptionHandler```: It is used to handle specific exceptions in a method. It can be used within a controller or a class annotated with ```@ControllerAdvice```. It targets exception handling for specific scenarios and can return custom error response, views, or JSON objects.