## Autowiring in Spring ##


1. What is Autowiring & different types of autowire ?
2. Mechanisms to trigger Autowired ? there are two approaches
3. Autowiring using xml configuration & using annotation @autowire in java end ?
4. How @Autowire is used and how it is getting resolved ? 
5. How Autowire conflict is resolved by using byName ?
6. What is @Qualifier ?  When both byName ( both name not matched ) and ByType ( both type are same ) autowire fails, in that case we can use @Qualifier to resolve to specific. refer example in beans.xml
7. How @Autowired works ? 
    * first it try to resolve with "byType".
    * if byType fails then it goes with "byName".

8. how to create a scenario where "byType" fails and "byName" autowire resolved ? 
By define two bean with same type but different id. In this case name keyword should match or use @Qualifier

9. The @Autowired annotation in Spring can be used in three primary ways: field , setter , and constructor injection.
10. You can define beans in XML and still use the @Autowired annotation in your Spring application. 
11. Why use property to set heartName & noOfHeart ? Can Autowire in this case as this also dependency ? 
@Autowire is only possible for object only and not primitive type ( int , String )

## Task:
1. How to create a bean to access JDBC connection.
   --> Load JDBC driver, in my case mysql com.mysql.cj.jdbc.Driver
   --> Get connection using driver manager uri method received from above step.


