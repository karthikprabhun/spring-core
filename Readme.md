Spring Core refers to the fundamental components of the Spring Framework, providing the essential features necessary for building Java applications. Here’s an overview of its key concepts and modules:

### 1. **Inversion of Control (IOC)**

- **Definition**: IOC is a design principle where the control of object creation and management is transferred from the application code to the Spring container. This promotes loose coupling and enhances testability.
- **Dependency Injection (DI)**: The most common way to implement IOC in Spring, allowing dependencies to be provided to classes either through constructors, setters, or fields.

### 2. **Bean Factory and Application Context**

- **Bean Factory**: The simplest container in Spring that manages beans and their lifecycles. It provides basic support for DI.

  ```java
  ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
  MyBean myBean = context.getBean(MyBean.class);
  ```

- **Application Context**: A more advanced container that builds on `BeanFactory`, offering additional features like event propagation, declarative mechanisms to create a bean, and support for internationalization.

  ```java
  ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
  ```

### 3. **Beans and Configuration**

- **Beans**: Objects that are managed by the Spring IoC container. You define beans in XML configuration files or using annotations (like `@Component`, `@Service`, `@Repository`, and `@Controller`).

- **Configuration**: You can configure beans using XML files, Java configuration classes, or a combination of both.

### 4. **Lifecycle of Beans**

Spring manages the lifecycle of beans, including:
- **Instantiation**: Creating an instance of the bean.
- **Dependency Injection**: Injecting dependencies as configured.
- **Initialization**: Performing any initialization logic (using `@PostConstruct` or `InitializingBean`).
- **Destruction**: Cleaning up resources (using `@PreDestroy` or `DisposableBean`).

### 5. **Scopes of Beans**

Spring supports various bean scopes, defining the lifecycle and visibility of a bean:
- **Singleton**: A single instance per Spring container (default).
- **Prototype**: A new instance is created every time the bean is requested.
- **Request**: A new instance for each HTTP request (used in web applications).
- **Session**: A new instance for each HTTP session (used in web applications).
- **Global Session**: A new instance for each global HTTP session (used in portlet applications).

### 6. **Aspect-Oriented Programming (AOP)**

While not strictly part of the core, AOP is closely related. It allows for the separation of cross-cutting concerns (like logging, transaction management, etc.) from business logic. Spring AOP provides support for defining aspects and advice.

### 7. **Spring Expression Language (SpEL)**

SpEL allows querying and manipulation of objects at runtime. You can use it to configure properties, call methods, and perform operations on beans defined in the Spring context.

### Summary

Spring Core provides the foundational building blocks for creating flexible, maintainable, and testable Java applications. Its focus on Inversion of Control and Dependency Injection helps decouple application components, making it easier to manage and evolve applications over time. The features related to bean management, lifecycle, and AOP further enhance its capability as a powerful application framework.