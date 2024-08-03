/**
 * totalcostperitem
 */
public class totalcostperitem {
    public static void main(String[] args) {
        
        // to calculate and output the total cost of a number of items:
        int items = 30;
float costPerItem = 9.99f;
float totalCost = items * costPerItem;
char currency = '$';
// Print variables
System.out.println("Number of items: " + items);
System.out.println("Cost per item: " + costPerItem + currency);
System.out.println("Total cost = " + totalCost + currency);




/*The main difference between primitive and non-primitive data types are:

Primitive types are predefined (already defined) in Java. Non-primitive types are created by the programmer and is not defined by Java (except for String).
Non-primitive types can be used to call methods to perform certain operations, while primitive types cannot.
A primitive type always has a value, while non-primitive types can be null.
A primitive type starts with a lowercase letter, while non-primitive types starts with an uppercase letter.
Examples of non-primitive types are Strings, Arrays, Classes, Interface, etc.*/

    }

    
}