# Instructions  

### Description:
This activity will help you understand the differences between the `=` operator, `==` operator and `equals()` method.

Please follow the steps below:
### Steps:
1. Copy and paste the following code inside the *main()* method in **Main.java**:
   ```java
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter an integer value");
    int original = sc.nextInt(); 
    sc.close();
    ```
   This code creates a Scanner object, asks the user to enter an integer value, and then saves the user's response into a variable named *original*.
3. Create an int variable called *copy* and assign it the value of the *original* variable. You would need to use the assignment operator `=` to give the *copy* variable the value of the *original* variable.
4. Below what you have so far in the *main()* method, copy and paste the following code to show that they the variables are equal:
   ```java
   System.out.println(original + " equals " + copy + ": " + (original == copy));
   ```
5. Hit the run button and enter an integer value into the console, then press `Enter`. The console is where your code output shows. You can enter any integer value. For instance, if I choose to enter `20` into the console and hit `Enter`, the console should show: `20 equals 20: true`.

Note that `original == copy` evaluates to `true` because both variables stores the same value. This is what we mean when we say the equality operator evaluates to a boolean (true/false) value. We can then use the boolean value that the operator evaluates to just as we would the values `true` or `false`.

5. Next, let's see how we can use `==` in a condition. Copy and paste the following code below what you have so far in the *main()* method:
   ```java
    if(copy == original){
      System.out.println("(copy == original) is " + (copy == original));
    }
   ```
   The `if` statement's condition evaluates the expression `copy == original`, which has a result of `true`. This means the print statement will run.
   
6. Now it's your turn. Create two int variables and assign one of them the value `100` and the other the value `100`.
7. Create an `if` statement to check if the two ints are equal. In the `if` statement's code block, create a print statement that prints out: `They are equal`.
8. So far, we've checked the equality of primitive values. Next, we'll look at comparing objects to see if they are equal. Copy and paste the following code below what you have so far in the *main()* method:
    ```java
      System.out.println("string"=="string");
      System.out.println("string".equals("string"));
    ```
   In this example, we checked the equality of some String objects in two different ways. The first way, using `==`, checks if the objects are the same exact object in memory. String literals, or Strings created using quotation marks, are stored in a place in heap memory called the **String Pool**. When a String is created as a literal, Java checks if a String object with the same exact character sequence is already in the pool. If there is one, instead of creating a new String object, Java re-uses the one in the pool to save memory. Because both values are String literals and they have the same character sequence, they are the same object in memory, so the first statement results in `true`.
<br>
   The second way of checking equality is with the *equals()* method. The this method doesn't check if the objects are the same exact object in memory. Instead, this method checks if the objects are **equivalent**, or if they have the same state. Because both Strings being compared by this method have the same characer sequence, the result of this method is also `true`. 
10. Now, let's create two String objects that are equivalent, but are two separate objects. Copy and paste the following code below what you have so far in the *main()* method:
    ``` Java
    String string1 = "Hello World";
    String string2 = new String("Hello World");
    ```
    The first String object is a literal, so it is stored in the String Pool. The second String object is *not* a string literal, it is created using object notation. This means it will be stored in the heap, but outside of the String Pool.
9.  Let's test to see if they are the same object or not. Create a statement that prints the result of comparing the values of the two reference variables, *string1* and *string2*, using the `==` operator. The output should be `false`.
11. Now try using the string method `equals()` for the same task as above and print the result. The result should be `true` because although they are not the same object in memory, they are equivalent (they have the same character sequence).

When testing if two objects are equivalent, whether or not they are Strings, you should use the *equals()* method rather than `==`. 


### Test:
Use the test provided. This test accounts for all the print statements already in the file.

#### Sample output:
```
Enter an integer value
10 equals 10: true
(copy == original) is true
They are equal
true
true
false
true
```
### References: 
https://www.javatpoint.com/string-pool-in-java - String Pooling