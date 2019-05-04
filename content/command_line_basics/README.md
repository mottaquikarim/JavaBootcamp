# Command Line Basics

How can we write something a bit more "dynamic" in java?

## Using Scanner

Java's native Scanner can be used to pull in system input for further processing.

Here's a basic usecase for scanning strings

```java

import java.util.Scanner;

// create a scanner so we can read the command-line input
Scanner scanner = new Scanner(System.in);

//  prompt for the user's name
System.out.print("Enter your name: ");

// get their input as a String
String username = scanner.next();
```

Or, ints:

```java

import java.util.Scanner;

// prompt for their age
System.out.print("Enter your age: ");

// get the age as an int
int age = scanner.nextInt();

System.out.println(String.format("%s, your age is %d", username, age));
```

Given this information, let's re-examine our payroll problems.


## PRACTICE


[Payroll I](/examples/cmd/payroll)
[Payroll II](/examples/cmd/payroll_2)
[Payroll III](/examples/cmd/payroll_3)
[Payroll IV](/examples/cmd/payroll_4)
