1. Add spring dependencies
Add application context to main method
Implement AppConfig class
Define SpringBean1 with @Component annotation
Define SpringBean2 with @Service annotation
Define SpringBean3 with @Repository annotation
Define SpringBean4 in another package

2. Create 2 beans SpringBean5 and SpringBean6 where SpringBean5 will be injected into SpringBean6 via **Constructor Injection**
Create SpringBean7 where SpringBean5 will be injected via **Setter Injection**

3. Create SpringBean8 and print a message inside the constructor, **with scope prototype** and inject into SpringBean6 And SpringBean7

4. Create BeanInterface interface with a method interfaceMethod() which will be implemented by ImplementationBean1, ImplementationBean2, ImplementationBean3. 
- implement interfaceMethod() to print a different message

5. Create a Autowired with list of BeanInterface and call interfaceMethod() on each of them.