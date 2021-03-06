# Java

Java is a multipurpose language used for desktop, web, mobile, servers, game, database connection, and more. It was created in 1995, and today, over 3 billion devices run Java.

## Key Java Terms

* `JAR (Java Archive)`: JAR is a platform-independent file format that aggregates many files into one. Multiple Java applets and their components (.class files, images, etc.) can be bundled in a JAR file and subsequently downloaded to a browser in a single HTTP transaction.
* `Java Development Kit (JDK)`: A software development environment for writing applets and application in the Java programming language.
* `Java Runtime Environment (JRE)`: A subset of the JDK for end-users and developers who want to redistribute the runtime environment. The Java runtime environment consists of the JVM, the Java core classes, and supporting files.
* `interpreter`: A module that alternately decodes and executes every statement in a body of code.
* `compiler`: A program to translate Java source code into bytecode for the JVM such that a computer can execute it. Once done, it saves it in a `.class` file.
* `Java Virtual Machine (JVM)`: The part of the JRE that acts as an interpreter for bytecodes.
* `bytecode`: Machine-independent code generated by the Java compiler and executed by the Java interpreter.

### Overview of the JRE/JDK

![jdk](/assets/jdk.jpg)

### Day in the life of a Java program

![developing](/assets/developing.png)

## Key Features

![features](/assets/java-features.png)

Among all these features, there's so much we can do with Java. Here are some of the highlights about the language:

### Object Oriented

One of the reasons for its continued popularity is its basis in the concept of **OOP, or Object-Oriented Programming**. Java and other object oriented languages revolve around these 4 main concepts:

When we consider a Java program, it can be defined as a collection of objects that communicate via invoking each other's methods. Let us now briefly look into what do class, object, methods, and instance variables mean.

**Object** − Objects have states and behaviors. Example: A dog has states - color, name, breed as well as behavior such as wagging their tail, barking, eating. An object is an instance of a class.

**Class** − A class can be defined as a template/blueprint that describes the behavior/state that the object of its type supports.

**Methods** − A method is basically a behavior. A class can contain many methods. It is in methods where the logics are written, data is manipulated and all the actions are executed.

**Instance Variables** − Each object has its unique set of instance variables. An object's state is created by the values assigned to these instance variables.

### Portable & Platform-Independent

* Java excels in portability, meaning it can run on multiple operating systems with little to no porting work necessary.
* Java is a compiled programming language, meaning it needs to be compiled into bytecode before it can be executed.
* Bytecode is processed by the Java Virtual Machine program and converted into instruction that the computer processor using it will understand.
* The JVM takes the place of the operating system, making Java a platform-independent language. The source code only needs to be compiled once, and then it will work on any platform (e.g. Windows, Mac, Linux, Raspberry Pi, etc.).


### Dynamic
* JVM now has dynamic code analysis, meaning code is analyzed while it is running. This increases the program's speed. 
* Java and the JVM can maintain performance and reliability while scaling. In fact, Twitter moved from Ruby-on-Rails to the JVM for scalability.

### Multithreaded
Java supports multithreading, a feature that allows concurrent execution of two or more parts of a program for maximum utilization of CPU.

#### (Sort of) Simple
Java is considered simple language because it does not have complex features like operator overloading, multiple inheritance, pointers and explicit memory allocation. *However*, a major drawback of Java is how verbose the code is. Other languages like Javascript, Python and PHP rival Java because they can often achieve the same goal with half the code.

#### (Sort of) Secure
We don’t have pointers and we cannot access out of bound arrays. That makes several security flaws like stack corruption or buffer overflow is impossible to exploit in Java. *However*, outdated java browser plug-ins in created vulnerabilities that hackers have exploited.

## Key Java Principles

### [Objects](https://docs.oracle.com/javase/tutorial/java/concepts/object.html)

### [Classes](https://docs.oracle.com/javase/tutorial/java/concepts/class.html)

### [Inheritance](https://docs.oracle.com/javase/tutorial/java/concepts/inheritance.html)

### [Interfaces](https://docs.oracle.com/javase/tutorial/java/concepts/interface.html)

### [Packages](https://docs.oracle.com/javase/tutorial/java/concepts/package.html)
