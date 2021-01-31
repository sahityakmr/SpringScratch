```
Basic Bean Scopes:
    1.  Singleton (Default Scope)
        - Beans are created while initializing application context. 
        - Once per Spring Container (Not purely singleton).
    2.  Prototype
        - A New bean is created for every request or reference.
        - Not initialized while initializing application context.
    3.  Web Aware Context
        - Request : New bean per servlet request.
        - Session : New bean per session.
        - Global Session : New bean per global HTTP Session.
        
Spring

BeanFactory can be used to make beans using some spring.xml config file. (Deprecated)

ApplicationContext also works the same way and is better to use.

Using getBean(id) method we can request a bean from BeanFactory or ApplicationContext, but it returns object, so we need to type cast.

In config xml, we can use <bean> tag to define a bean, can provide id and class attributes to provide an Id and define the class of that bean.
    <bean id="triangle" class="com.example.Triangle">

To invoke bean creation with no-args constructor, a no args constructor should be present.

We can use <property> tag to assign a value to the field of this class, but this <property> tag makes use of setter, so won't work without it.
    <property name="type" value="Isoscales"/>

If there are two constructors taking single value, one of type int and second of type String, then both of the following snippet will invoke the string constructor,
because spring treats all value as string by defualt.
    <constructor-arg value="Isoscales"/>
    <constructor-arg value="5"/>

To invoke the int constructor using the second snippet, we'll have to modify it in the following way:
    <constructor-arg value="Isoscales" type="int"/>

To use auto type casting we can make use of index attribute while invoking constructors:
    <constructor-arg index="1" value="20"/>
    <constructor-arg index="0" value="30"/>

Instead of injecting values using <property> tag we can also inject another bean using following snippet:
    <property name="pointA" ref="pointA"/>

We can use an inner tag <idref> in following way to restrict using id only:
    <idref bean="pointZero"/>

Also we can define another bean just inside the property tag, this bean will be assigned as value for that property.

To create alias of a bean we can make use of:
    <alias name="pointerTriangle" alias="triangle"/>

We can also add list and map type of properties using configs 
```