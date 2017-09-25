import java.util.Scanner;

/**
 * Created by mahesh on 08/08/2017.
 */
public class factorial
{
    public static void main(String args[]){
        int i,fact=1;
        int number=57;
        for(i=1;i<=number;i++){
            fact=fact*i;
        }
        System.out.println("Factorial of "+number+" is: "+fact);

}}
