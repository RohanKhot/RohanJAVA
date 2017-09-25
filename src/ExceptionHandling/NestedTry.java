package ExceptionHandling;

/**
 * Created by rohan on 15/9/17.
 */
 class NestedTry
{
    public static void main(String[] args) {
        try{
            try {
            System.out.println("hee");
           int i = 5/0;


        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
            {System.out.println("ijfj");}
    }catch(ArithmeticException r)
        {
            System.out.println(r);
        }
    }
}