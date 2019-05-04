# Loops

## Iterating with Loops

In programming, we define `iteration` to be the act of running the same block of code over and over again a certain number of times.For example, say you want to print out every item within an array. You certainly *can* write a print statement for each item, but what if there were over 1000 items in that array? Or, worse still, what if that array changed based on user input (ie: *either* 10 items *or* 10000 items)?

To solve such problems, we can create a **loop** that will iterate through each item in our array and run the `System.out.println()` function. This way, we only have to write the print() one time to print out the whole list!

## the `for` & `for each` loops

Here's the general syntax. Notice the placement of the comma and semi-colons, and we'll walk through each part. followed by a very basic example.

```java
for (statement 1; statement 2; statement 3) {
  // code block to be executed
}

for (type variable : arrayname) {
  // code block to be executed
}


int iterations = 10;
for (int i = 0; i < iterations; i++) {
  System.out.println(i);
}

// Output --> 1 2 3 4 5 6 7 8 9 10
```

All this loop does is count from 1 to 10 and print out each number.

`int i = 0;` is the *initialization* phase.
- This is executed once, before the loop begins.
Note that int i is declared within this phase. This means that the lifespan of i is limited to within the for loop, which is a much cleaner, and leads to less problems down the line.

`i < iterations;` is the *termination* phase.
Every time the loop evaluates, it checks this statement.
If this statement evaluates to false, the loop terminates.
This is equivalent to the while section of the do...while loop.

`i++` is the *increment expression* (aka the *counter*).
This happens every time the loop evaluates.
This is equivalent to the do section of the do...while loop.
In this case, each loop, i is incremented by 1.

`System.out.println(i);` is the body code to be executed
In this example, we simply print out the current number (which is represented by "i").


Examples:

```java
// for loop
String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
for (int i = 0; i < cars.length; i++) {
  System.out.println(cars[i]);
}

// for each loop
String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
for (String i : cars) {
  System.out.println(i);
}
```

## the `while` & `do/while` loops

The while loop loops through a block of code as long as a specified condition is true.

General syntax:

```java
while (condition) {
  // code block to be executed
}

do {
  // code block to be executed
}
while (condition);
```

Examples:

```java
int i = 0;
while (i < 5) {
  System.out.println(i);
  i++;
}

int i = 0;
do {
  System.out.println(i);
  i++;
}
while (i < 5);
```

What is happening here is we are running the code block within the `while` 4 times. We know to stop because the `boolean comparison` will evaluate to `False` once `i = 5`. This is possible only because `i` is being incremented when we write `i++`.

Note that in the do/while example, the loop will always be executed at least once, even if the condition is false, because the code block is executed before the condition is tested.

## Nested Loops

We can also use a for loop inside another for loop to get the elements of a two-dimensional array (we still have to point to the two indexes):

```java
public class MyClass {
  public static void main(String[] args) {
    int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
    for (int i = 0; i < myNumbers.length; ++i) {
      for(int j = 0; j < myNumbers[i].length; ++j) {
        System.out.println(myNumbers[i][j]);
      }
    }
  }
}
```


```java
```


```java
```

```java
```


## Control Flow in Loops with `break` & `continue`

Something very important to watch out for here is falling into an **infinite loop**. This is one of the most common traps and can make your code go crazy running the loop over and over without moving through the rest of the program!

#### `break` Statements
In a Python loop, the `break` keyword *escapes the loop*, regardless of the iteration number and regardless of how much of the loop code it has completed on its current iteration. Once a break executes, the program will continue to execute after the loop.

We might use a break statement if we only want the loop to iterate under a certain condition. For example:


#### `continue` Statements
You can also use the `continue` keyword to interrupt the loop code. The difference is that the `continue` keyword escapes *only the current iteration*. A `break` escapes the loop entirely and goes on to execute the code immediately following the loop. A `continue` tells the program to stop where it is within the within the current iteration and *skip to the the next iteration* of the loop. 

Here's an example:

```java
// for loop example
for (int i = 0; i < 10; i++) {
  if (i == 4) {
    continue;
  }
  System.out.println(i);
}

// while loop example
int i = 0;
while (i < 10) {
  if (i == 4) {
    i++;
    continue;
  }
  System.out.println(i);
  i++;
}
```

#### Infinite Loops
Infinite loops can occur when there is not proper control flow in the loop's code. See if you can figure out why this loop is infinite.

```python
a = ['foo', 'bar', 'baz', 'qux', 'corge']
while a:
    if len(a) < 3:
        continue
    print(a.pop())
print('Done.')


# just need to write this in java
```

Got it? After the first three iterations, `a` shrinks to fewer than three items and executes a `continue` statement. It then returns to the beginning of the loop, where it will find that `a` still has fewer than three items. So it goes back to the beginning again... and again and again and again... 

Your program will get stuck here, so you want to make sure you pay special attention to the control flow when you write loops!


## PRACTICE

1. Print all the numbers from 1 through 5.

```java
for (int i = 0; i < 6; i++) {
  System.out.println(i);
}
```

2. Print only the even numbers between 0 and 10.

```java
for (int i = 0; i <= 10; i = i + 2) {
  System.out.println(i);
}
```




