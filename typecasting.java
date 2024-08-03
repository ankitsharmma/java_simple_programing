
    
/**
 * typecasting
 */
public class typecasting {

    public static void main(String[] args) {
        /*In Java, there are two types of casting:

Widening Casting (automatically) - converting a smaller type to a larger type size
byte -> short -> char -> int -> long -> float -> double

Narrowing Casting (manually) - converting a larger type to a smaller size type
double -> float -> long -> int -> char -> short -> byte */

//1-Widening Casting

int myInt = 9;
double myDouble = myInt; // Automatic casting: int to double.
System.out.println(myDouble); // Prints 9.0
// 2- narrowing casting

double myDouble1 = 9.78;
int myInt1 = (int) myDouble1; // Manual casting: double to int
System.out.println(myInt1); // Prints 9
//Real-Life Example
int maxScore = 500;

// The actual score of the user
int userScore = 423;

/* Calculate the percantage of the user's score in relation to the maximum available score.
Convert userScore to float to make sure that the division is accurate */
float percentage = (float) userScore / maxScore * 100.0f;

System.out.println("User's percentage is " + percentage);
}
}