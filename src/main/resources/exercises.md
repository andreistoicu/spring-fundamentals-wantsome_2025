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

**HTML**

Create a HTML document that includes:
A title "My First HTML Page"
A heading (h1) with the text "Welcome to My Page"
A paragraph with the text "This is my first HTML page. I'm learning how to create web pages using HTML."

Create a HTML document that includes:
first html
- a heading(h2) with the text "My Favorite Fruits"
- an unordered list of your three favorite fruits

second html
- a heading(h2) with the text "Useful Links"
- 3 hiperlinks to your favorite websites. Use descriptive text for the links.

3rd html 
 - a heading(h2) with the text "My favorite animal"
 - an image of your favorite animal. Use the alt attribute to provide alternative text for the image.

4rd html
- a heading(h2) with the text "My daily routine"
- an ordered list with at least 3 items representing the daily routine.
- Within one of the list items, include a nested unordered list with sub-tasks or activities.

**Homework - 2 - SPRING MVC HTML**
FORMS1. Create an HTML form with the POST method and an action attribute set to "/submit".
The form should include a required text input for "First Name" with the id and name attributes set to "firstname".
Include another required text input for "Last Name" with the id and name attributes set to "lastname".
Add a required email input for "Email" with the id and name attributes set to "email".
Include a password input for "Password" with the id and name attributes set to "password" and required for submission.
Add a date input for "Date of Birth" with the id and name attributes set to "dob" and required.
Incorporate a group of radio buttons for "Subscription Plan" with options for "Basic", "Standard", and "Premium",
each with the name attribute set to "plan" and unique id and value attributes ("basic", "standard", "premium") .
Include a group of checkboxes for "Interests" with options "Technology", "Sports", and "Arts",
each with the name attribute set to "interests" and unique id and value attributes ("tech", "sports", "arts").
Finally, add a button element of type "submit" with the text "Register".

