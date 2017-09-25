package Test3;

/**
 * Created by rohan on 8/9/17.
 */
public class FactorialRecur {
    static int factorial(int n){
        if (n == 1)
            return 1;
        else
            return(n * factorial(n-1));
    }

    public static void main(String[] args) {
        System.out.println("Factorial of 5 is: "+factorial(5));
    }
}
