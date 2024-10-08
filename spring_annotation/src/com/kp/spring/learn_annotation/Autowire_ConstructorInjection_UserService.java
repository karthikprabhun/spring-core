package com.kp.spring.learn_annotation;

import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.stereotype.Component;

@Component
public class Autowire_ConstructorInjection_UserService {

    private final UserRepository userRepository;

    @Autowired
    public Autowire_ConstructorInjection_UserService(UserRepository userRepository) { // Constructor injection
        this.userRepository = userRepository;
    }

    public void performAction() {
        // Use userRepository
    }
}

/*
Why final keyword used while defining UserRepository Object ?

1. Immutability

    Declaring the dependency as final ensures that it cannot be reassigned after the object is constructed. This promotes immutability, meaning the state of the object remains constant after it's created, which can lead to fewer bugs and clearer code.

2. Mandatory Dependencies

    Using final indicates that the dependency is required for the object to function correctly. It enforces that the dependency must be provided at the time of construction, making it clear to anyone reading the code that UserRepository is essential for UserService.

3. Thread Safety

    Immutable objects are inherently thread-safe, as their state cannot change after construction. This can be beneficial in a multi-threaded environment, common in Spring applications.


While IOC (Inversion of Control) does ensure that dependencies are managed by the Spring container, explicitly marking a dependency as `final` serves several important purposes:

### 1. **Code Clarity**
   - By using `final`, you make it explicit that the dependency is mandatory and cannot be changed. This improves readability and understanding for anyone reviewing the code.

### 2. **Constructor Enforcement**
   - Even though the Spring container will inject the dependency, marking it as `final` ensures that it must be provided at the time of object creation. It prevents the possibility of the dependency being uninitialized if the constructor is called improperly in other contexts (like during manual testing or if used outside Spring).

### 3. **Intentional Design**
   - Using `final` communicates your intent that the dependency is critical for the object’s functionality. It signals to other developers that this is not an optional or mutable dependency, which is an important design consideration.

### 4. **Immutable Objects**
   - Immutability can lead to safer and more predictable code. If a class's state cannot change after construction, it can help avoid unintended side effects and bugs.

### 5. **Consistency**
   - Following the practice of using `final` for mandatory dependencies can help maintain consistency throughout the codebase. This can simplify maintenance and reduce cognitive load when developers know what to expect.

### Summary

While IOC does manage dependencies, explicitly declaring them as `final` enforces best practices related to clarity, immutability, and design intent. It helps create a robust and maintainable codebase, ensuring that dependencies are clearly defined and cannot be modified after construction.

*/
