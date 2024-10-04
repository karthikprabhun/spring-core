
How to inject / set literal value dynamically from property file
    
How spring is going to know that from which file properties are loaded?
    <context:property-placeholder location="classpath"> 

How to inject literal values using annotation and not by <property> in xml ?
    use @Value("${value}") above setter method. for example, @Value("Karthik") above setter method for field "name"
    Do not forget to set <context:annotation-config> in the xml config to trigger annotation feature. 

How to set mandatory filed ?
    Use @Required in java side or use xml bean definition inline property
    @Required without @Value should throw bean init failed exception

Inject value by setter method level or filed level ?
    @Value on filed level will not execute logic inside setter method. Check by having a print statement as described by first hint. 

Can we use @Required in the filed level ?
    At the time of learning, spring 5.1 >  @Required annotation deprecated , so use dependency injection instead.

## Hint:
print value with in the setter method to ensure values/ref are injected. 



