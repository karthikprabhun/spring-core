Spring IOC ( Inversion of Control ) is a core principle of the Spring framework that promotes loose coupling in applications.


## Key Concepts

**Inversion of Control:**

    Traditionally, in a tightly coupled system, the application components are responsible for their own dependencies. With IOC, the control of instantiating and managing objects is transferred to the Spring container.
    This means that instead of your classes creating their dependencies, the Spring container injects them.

**Dependency Injection (DI):**

    DI is the most common way to implement IOC. It allows you to define how your objects (beans) are wired together.
    There are mainly three types of dependency injection:
        Constructor Injection: Dependencies are provided through class constructors.
        Setter Injection: Dependencies are set through setter methods after the object is created.
        Interface Injection: Dependencies are provided through an interface method (less common).

**Spring Container:**

    The Spring container is responsible for managing the lifecycle of beans (objects) and their dependencies.
    It reads configuration metadata (usually in XML or Java annotations) to know how to create and manage beans.

**Aspect Oriented Programing (AOP):**

#### Conclusion

1. Spring IOC and DI facilitate building scalable and maintainable applications by managing object dependencies. It’s a fundamental aspect of the Spring Framework that helps developers create clean, decoupled code.
2. IOC is a fundamental principle that enables better design and architecture, but it’s part of a broader ecosystem within the Spring Framework. Using it alongside other concepts like DI, AOP, and various Spring modules creates a robust framework for building applications.

Hint:
1. Main program demonstrate DI with and without Spring framework.