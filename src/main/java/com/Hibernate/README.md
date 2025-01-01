## Hibernate
- It streamlines data persistence and retrieval without the need for complex SQL queries.
- With features like automatic transaction management and caching. Hibernate simplifies and optimizes database interactions.
- Hibernate is a higher level ORM framework that automates these tasks allows developers to work with java objects and abstracting away low-level DB operations.
- ### Lifecycle
  - **Transient State**: when we instantiate an object of POJO class.
  - **Persistent State**: Once an object is connected with Hibernate session.
    - There are 2 ways for Transient state to Persistent state
      - Save the entity into DB table.
      - Load the entity into DB table.
        - session.persist(e);
        - session.save(e);
        - session.saveOrUpdate(e);
        - session.update(e);
        - session.merge(e);
        - session.lock(e);
  - **Detached State**: When we move persistent state to Detached state. 
    - **It can be done via two ways:** Either close the session or clear its cache.
    - As the session closed or cleared cache, then any changes to the data will not affect the database table.
    - Whenever needed, the detached objects can be reconnected to a new Hibernate session.
    - To reconnect the detached objects to a new Hibernate session, we will use the following methods
      - merge()
      - save()
      - update()
      - load()
      - refresh()
    - Methods for detached state
      - detach()
      - close()
      - clear()
      - evict()
  
  - **Removed State:** When the entity object is deleted from the DB the entity object is known to be in removed state.
    - It is done by calling delete() method. 



## JPA (Java Persistence API)
- JPA is a set of rules and guidelines to set interfaces for implementing ORM.
- It needs few classes and interfaces.
- It supports simpler, cleaner and assimilated ORM.
- Dynamic and named queries can be included in JPA.

## Comparison Table

| JPA                                           | Hibernate                                                                                              |
|-----------------------------------------------|--------------------------------------------------------------------------------------------------------|
| JPA describes the handling of relational data | Hibernate is an ORM tool that is used to save the java objects in RDB                                  |
| It only a java specification                  | It an implementation of JPA. Hence, the common standard which is given by JPA is followed by Hibernate |
| It is an standard API that permits to perform database operation | It is used is mapping java data types with SQL data types and database tables.                         |
| Requires a JPA provider for actual usage.     | Can function standalone or as a JPA provider.                                                          |
| JPQL                                          | JPQL, HQL (Hibernate Query Language), SQL.                                                             |
| Relies on the JPA provider.                   | Built-in First-level and Second-level caches.                                                          |
| Vendor-neutral (requires provider switching). | Tied to Hibernate-specific APIs if used directly.                                                      |
| Limited to specification features.            | Enriched with advanced mappings and utilities.                                                         |

---

## JDBC
- JDBC is a low-level API that requires manual handling of database connections, writing SQL queries and managing result sets.  
- JDBC provides a set of Java APIs to access the relational databases from the java program.
- Java APIs enable program to execute SQL statements and interact with and SQL database.
- JDBC gives a flexible architecture to write a database-independent web application that can execute on different platforms and interact with DBMS without any change.

## ORM (Object Relational Mapping)
- An ORM simplifies the data creation, data manipulation and data access.
- It is a programming technique that maps the objects to the data stored in the database.
- The ORM tool internally uses the JDBC API to interact with the Database.

