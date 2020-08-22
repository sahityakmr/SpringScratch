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
```