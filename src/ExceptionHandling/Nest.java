package ExceptionHandling;

/**
 * Created by rohan on 15/9/17.
 */
public class Nest
{
    public static void main(String[] args) {
        try{ int i=9/0;
            System.out.println("hefubui");}catch (ArithmeticException e){
            System.out.println(e);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
    }
}
