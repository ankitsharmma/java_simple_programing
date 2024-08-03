/**
 * operators
 */
public class operators {

    public static void main(String[] args) {
        /*Java divides the operators into the following groups:

Arithmetic operators
Assignment operators
Comparison operators
Logical operators
Bitwise operators */

        // Arithmetic operators
        int x = 10;
        int y = 5;
      
        System.out.println(x + y);

        System.out.println(x - y);

        System.out.println(x * y);

        System.out.println(x / y);

        System.out.println(x % y);

        System.out.println(x++);

        System.out.println(x--);
        // Assignment operators

        int a = 10;
        int b = 5;

        a += b;
        System.out.println(a);

        a -= b;
        System.out.println(a);

        a *= b;
        System.out.println(a);

        a /= b;
        System.out.println(a);

        a %= b;
        System.out.println(a);

        // Comparison operators
        int c = 10; 
        int d = 5;

        System.out.println(c == d);

        System.out.println(c != d);

        System.out.println(c > d);

        System.out.println(c < d);

        System.out.println(c >= d);

        System.out.println(c <= d); 

        // Logical operators

        int e = 10;

        int f = 5;
        if (e > f) {
            System.out.println("e is greater than f");
        } else {
            System.out.println("e is not greater than f");
            
        }
        if (e>f && e!=f) {
            System.out.println("e is greater than f and e is not equal to f");
            
        }
        if (e>f || e!=f) {
            System.out.println("e is greater than f or e is not equal to f");
            
        }
        if (e>f ^ e!=f) {
            System.out.println("e is greater than f or e is not equal to f");
            
        }
        if (!(e>f)) {
            System.out.println("e is not greater than f");
            
        }
        // Bitwise operators
        int g = 10; 
        int h = 5; 
        int i = g & h; 
        System.out.println(i); 
        int j = g | h; 
        System.out.println(j); 
        int k = g ^ h; 
        System.out.println(k); 
        int l = ~g; 
        System.out.println(l); 
        int m = g << 2; 
        System.out.println(m); 
        int n = g >> 2; 
        System.out.println(n); 
        int o = g >>> 2; 
        System.out.println(o);

       

    }

}