# Basic Data Types

Let's take a moment to explore some basic data types in java.

A `data type` is a unit of information that can be stored and retrieved using a program language. In Java, there are two categories of data types:

* Primitive data types - byte, short, int, long, float, double, boolean & char
* Non-primitive data types - String, Array, and Class

The most basic data types are `String`, `int`, `float`, `char`, and `boolean`.

In the examples below, we follow this general syntax: `<data_type> <var_name> = <value>`.

## Primitives

```java
String name = "Taq"; // 
int num = 10; // a whole number
float myFloatNum = 5.99f; // a decimal
char myLetter = 'J'; // a string that is one character long
boolean myBool = true; // true or false
```

To make life easier, you can create more than one variable at a time like so:

```java
int x = 5, y = 6, z = 50;
System.out.println(x + y + z); // 61
```

## Arrays

An `array` works a bit differently. `Arrays` are unique in that we use them to store multiple values in a single variable, instead of declaring separate variables for each value.

>>I think they need to be homogenous......? 

```java
String[] cars = {"Volvo", "BMW", "Ford", "Mazda"}; // array of strings 
int[] myNumbers = { 1, 2, 3, 4, 5 }; // array of ints

System.out.println(cars.length); // 4
```

The `index` means the location of an *element* in the array. You can use the index to access or manipulate a specific item in an array. It's important to note that *indexes start counting at 0!*

| List | "Volvo" | "BMW" | "Ford" | "Mazda" |
|:-----:|:------:|:-----:|:------:|:-------:|
| Index |    0   |   1   |    2   |    3    |

```java
String[] cars = {"Volvo", "BMW", "Ford", "Mazda"}; // an array of strings 

// Access array element via index
System.out.println(cars[0]); // Volvo


// Update array element via index
cars[0] = "Opel";
System.out.println(cars[0]); // Opel
```

## Multidimensional Arrays

Java also has the concept of `multidimensional arrays`, which are arrays that themselves contain one or more arrays. To access the elements of a multidimensional array, we have to specify two indexes: one for the array and one for the element inside that array. In the example below, we access the third item (index 2) in the second array (index 1).

```java
int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
int x = myNumbers[1][2]; // 7
```

## Typecasting

Sometimes, we need to convert one datatype to another. Typecasting allows us to convert between types. Java separates typecasting syntax based on the relative size of the initial and resultant items.

* `Widening casting` is done automatically when passing a smaller size type to a larger size type
* `Narrowing casting` must be done manually by placing the type in parantheses in front of the value

```java
public class MyClass {
  public static void main(String[] args) {
    int myInt = 9;
    double myDouble = myInt; // Widening/Automatic casting

    System.out.println(myInt);      // 9
    System.out.println(myDouble);   // 9.0

    double myDouble = 9.78;
    int myInt = (int) myDouble; // Narrowing/Manual casting

    System.out.println(myDouble);   // 9.78
    System.out.println(myInt);      // 9
  }
}
```

## Operators

Operators provide short cuts for how we can manipulate the data in our code. Java divides operators into `arithmetic operators`, `comparison operators`, `logical operators`, and `assignment operators`.

### Arithmetic Operators

We can operate on integers/floats in the following ways:

```java
public class MyClass {
  public static void main(String[] args) {
    int var1 = 100 + 50;      // 150 (100 + 50)
    int var2 = var1 - 90;     // 10 (150 - 90)
    int var3 = var2 * var2;   // 1500 (150 * 10)
    int var4 = var3 / 150;    // 10 (1500 / 150)
    int var5 = var4 % 3;      // 1 (10 / 3 = 3 remainder 1)
  }
}
```

###  Comparison Operators

Comparison operators return booleans based on the validity of a statement comparing two variables or values.

```java
public class MyClass {
  public static void main(String[] args) {
    int x = 5;
    int y = 3;

    System.out.println(x == y); // returns false
    System.out.println(x != y); // returns true
    System.out.println(x > y); // returns true
    System.out.println(x < y); // returns false
    System.out.println(x >= y); // returns true
    System.out.println(x <= y); // returns false
  }
}
```

### Logical Operators

https://introcs.cs.princeton.edu/java/11cheatsheet/images/boolean-ops.png

Logical operators are used to determine the validity of a logical statement about two variables or values.

`&&` - *Logical and* returns true if both statements are true

```java
public class MyClass {
  public static void main(String[] args) {
    int x = 5;
    System.out.println(x > 3 && x < 10); // returns true because 5 is greater than 3 AND 5 is less than 10
  }
}
```

`||` - *Logical or* returns true if one of the statements is true

```java
public class MyClass {
  public static void main(String[] args) {
    int x = 5;
    System.out.println(x > 3 || x < 4); // returns true because one of the conditions are true (5 is greater than 3, but 5 is not less than 4)
  }
}
```

`!` - *Logical not* reverses the result and returns false if the result is true

```java
public class MyClass {
  public static void main(String[] args) {
    int x = 5;
    System.out.println(!(x > 3 && x < 10)); // returns false because ! (not) is used to reverse the result
  }
}
```

###  Assignment Operators

Assignment operators are used as a shortcut for assigning values to variables.

```java
public class MyClass {
  public static void main(String[] args) {
    int x = 100;

    System.out.println(x += 5); // 105 (100 + 5)
    System.out.println(x -= 5); // 100 (105 - 5)
    System.out.println(x *= 5); // 500 (100 * 5)
    System.out.println(x /= 5); // 100 (500 / 5)
    System.out.println(x %= 5); // 0 (100 % 5 = 20 remainder 0)
  }
}
```


## PRACTICE

[Payroll I](/examples/data_types/payroll)
[Payroll II](/examples/data_types/payroll_2)
[Payroll III](/examples/data_types/payroll_3)
[Payroll IV](/examples/data_types/payroll_4)
