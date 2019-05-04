<!---
{"next": "Topics/loops.md","title": "Control Flow"}
-->

# Control Flow

## Control Flow via Conditional Statements
In order for code to be useful, it is imperative to have the ability to make decisions. In most languages, we use the **conditional** statement to facilitate decision making.

A conditional will attempt to evaluate an expression down to a boolean value - either `true` or `false`. Based on the boolean evaluation, the program will then execute or skip a block of code.

### if

```java
public class IfStatementExample {

   public static void main(String args[]){
      int num=70;
      if( num < 100 ){
	  /* This println statement will only execute,
	   * if the above condition is true
	   */
	  System.out.println("number is less than 100");
      }
   }
}
```

#### Nested if

```java
public class NestedIfExample {

   public static void main(String args[]){
        int num=70;
	if( num < 100 ){ 
           System.out.println("number is less than 100"); 
           if(num > 50){
	      System.out.println("number is greater than 50");
	   }
	}
   }
}
```

### if-else

```java
public class IfElseExample {

   public static void main(String args[]){
     int num=120;
     if( num < 50 ){
	System.out.println("num is less than 50");
     }
     else {
	System.out.println("num is greater than or equal 50");
     }
   }
}
```

### if-else-if

```java
public class IfElseIfExample {

   public static void main(String args[]){
	int num=1234;
	if(num <100 && num>=1) {
	  System.out.println("Its a two digit number");
	}
	else if(num <1000 && num>=100) {
	  System.out.println("Its a three digit number");
	}
	else if(num <10000 && num>=1000) {
	  System.out.println("Its a four digit number");
	}
	else if(num <100000 && num>=10000) {
	  System.out.println("Its a five digit number");			
	}
	else {
	  System.out.println("number is not between 1 & 99999");			
	}
   }
}
```

## Control Flow via Switch Cases


Switch case statement is used when we have number of options (or choices) and we may need to perform a different task for each choice.

The syntax of Switch case statement looks like this –

```java
switch (variable or an integer expression)
{
     case constant:
     //Java code
     ;
     case constant:
     //Java code
     ;
     default:
     //Java code
     ;
}
```

Here's how the logic works: First the variable, value or expression which is provided in the switch parenthesis is evaluated and then based on the result, the corresponding case block is executed that matches the result.

Take a look at this simple example:

```java
String food = "apple";

	switch(food) {
    case "pear":
    	System.out.println("I like pears");
    	break;
    case "apple":
      	System.out.println("I like apples");
      	break;
    default:
      	System.out.println("No favourite");
  }
```


```java
public class SwitchCaseExample1 {

   public static void main(String args[]){
     int num=2;
     switch(num+2)
    
    { case 1:
	  System.out.println("Case1: Value is: "+num);
	case 2:
	  System.out.println("Case2: Value is: "+num);
	case 3:
	  System.out.println("Case3: Value is: "+num);
        default:
	  System.out.println("Default: Value is: "+num);
      }
   }
}

// Default: Value is: 2
```



### Break Statements

Break statements are used when you want your program-flow to come out of the switch body. Whenever a break statement is encountered in the switch body, the execution flow would directly come out of the switch, ignoring rest of the cases

```java
public class SwitchCaseExample2 {

   public static void main(String args[]){
      int i=2;
      switch(i)
      {
	 case 1:
	   System.out.println("Case1 ");
	   break;
	 case 2:
	   System.out.println("Case2 ");
	   break;
	 case 3:
	   System.out.println("Case3 ");
	   break;
	 case 4:
           System.out.println("Case4 ");
           break;
	 default:
	   System.out.println("Default ");
      }
   }
}

// Case2
```

Note that only case 2 had been executed, rest of the cases were ignored. *Why didn’t I use the break statement after the default though?* The default statement automatically tells the program to exit the switch flow, so a break statement is not needed.

## PRACTICE

1. https://beginnersbook.com/2017/09/java-program-to-find-largest-of-three-numbers/


2. https://beginnersbook.com/2017/09/java-program-to-check-if-number-is-positive-or-negative/

3. https://beginnersbook.com/2014/02/java-program-to-check-even-or-odd-number/

4. https://beginnersbook.com/2017/09/java-program-to-check-vowel-and-consonant-using-switch-case/

5. https://beginnersbook.com/2017/09/java-program-to-make-a-calculator-using-switch-case/


