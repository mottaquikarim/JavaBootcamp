<!---
{"next":"Topics/subclasses.md","title":"Classes"}
-->

# Classes & Inheritance

**Classes**, and their facilitation of **inheritance**, are one of the most important and valuable java objects. A **class** is essentially a data structure that serves as a blueprint for categorizing other objects and storing metadata about them. Once you have your "blueprint", you can create new **instances** of that class, which store unique metadata values. 

- Class Definition
- Class Instantiation
- Attributes
- Methods

For reference, here's the anatomy of a class. We'll go through each part below.

<img src="https://introcs.cs.princeton.edu/java/11cheatsheet/images/class.png"/ style="display: block;">

## Class Definition Example 1 - Basic Elements in Context
Now that we've isolated each key component of classes, let's put everything together by completing the code for our zoology scenario. At the highest level, we define a class called `Animal`. The annotated code below illustrates how each key structural element we covered above fits into this task.

```java
public class Person {
    // A) private stuff  ... ?
    private String name, address, emailAddress, phoneNumber;

    // B) Contructor parameters
    public Person(String name, String address, String emailAddress, String phoneNumber){
        Name = name;
        Address = address;
        EmailAddress = emailAddress;
        PhoneNumber = phoneNumber;
    }

    // C) Methods
    public String getName() {
        // D) Method accesses & returns attribute
        return Name;
    }

    public String getName() {
        return name;
    }

    // void ??? I think this is maybe a function...?
    public void setName(String name) {
        // E) Method updates value of an attribute
        Name = name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getEmailAddress() {
        return EmailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        EmailAddress = emailAddress;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }
}
```


Static vs. Non-Static
https://git.generalassemb.ly/ga-wdi-boston/programming-fundamentals-in-java/blob/master/baseline-materials/OOP-fundamentals-lesson/README.md#demo-static-vs-non-static-10-mins


## Accessing the Animal Class in Main

```java
public class Main {

    public static void main(String[] args) {
  // write your code here

        Person jack = new Person("yan", "65 Hill Street", "jack@gmail.com", "3433433434");
        Employee jill = new Employee("yan1", "21 Country Lane", "jill@gmail.com", "1234567890");

        System.out.println(jill.getDateHired());


        // should add more stuff here....
    }

}
```


## Practice Problems

