import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    log("Enter an integer value");
    int original = sc.nextInt();

    /* Section 2 */
    int copy = original;
    log(original + " equals " + copy + ": " + (original == copy));

    /* Section 5 */
    if (copy == original) {
      log("(copy == original) is " + (copy == original));
    }

    /*
     * Section 6 Action Item: Create two int variables and assign one of them the
     * value 100 and the other the value 100.
     */
    int myInt = 100;
    int myInt2 = 100;

    if (myInt == myInt2) {
      log("They are equal");
    }

    /* Section 9 */
    String string1 = "Hello World";
    String string2 = new String("Hello World");

    log("string" == "string");
    log("string".equals("string"));

    /* Section 8 */
    log(string1 == string2);
    log(string1.equals(string2));

    /* Always close the Scanner */
    sc.close();

  }

  public static void log(Object message) {
    System.out.println(message);
  }
}