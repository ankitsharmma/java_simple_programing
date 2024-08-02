/**
 * main
 */
public class main {

   public static void main(String[] args) {
    //print text
     System.out.println("Hello World!");
     //print number
     System.out.print(3);
//varable data type declaration
     int number = 3;
     System.out.println(number);
     String name = "John";
System.out.println(name);

//Final Variables the final keyword (this will declare the variable as "final" or "constant", which means unchangeable and read-only):
   final int myNum = 15;
    /*myNum = 20 
    will generate an error: cannot assign a value to a final variable*/
System.out.println(myNum);
//varable other data type
int Num = 5;
float myFloatNum = 5.99f;
char myLetter = 'D';
boolean myBool = true;  
String myText = "Hello";

System.out.println("My number is " +Num+ " ,float number is " +myFloatNum+ ",My letter is " +myLetter+ ",My bool is " +myBool+ ",My text is " +myText);

   }
   
  
}