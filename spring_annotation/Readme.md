## Autowiring in Spring ##


1. What is Autowiring & different types of autowire ?
2. Mechanisms to trigger Autowired ? there are two approaches
3. Autowiring using xml configuration & using annotation @autowire in java end ?
4. How @Autowire is used and how it is getting resolved ?
5. How Autowire conflict is resolved by using byName ?
6. What is @Qualifier ? 
7. How @Autowired works ? 
    * first it try to resolve with "byType".
    * if byType fails then it goes with "byName".

8. how to create a scenario where "byType" fails and "byName" autowire resolved ? 
By define two bean with same type but different id. In this case name keyword should match or use @Qualifier

9. @Autowire on top of filed, setter & constructor. How it is different and resolved ? 

10. Why use property to set heartName & noOfHeart ? Can Autowire in this case as this also dependency ? 
@Autowire is only possible for object only and not primitive type ( int , String )

## Task:
1. How to create a bean to access JDBC connection.
   --> Load JDBC driver, in my case mysql com.mysql.cj.jdbc.Driver
   --> Get connection using driver manager uri method received from above step.
