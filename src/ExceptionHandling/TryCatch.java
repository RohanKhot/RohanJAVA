package ExceptionHandling;

/**
 * Created by rohan on 7/9/17.
 */
public class TryCatch {

    public static void main(String args[]){
        try{
            int data=50/0;
        }catch(ArithmeticException e){System.out.println(e);}
        System.out.println("rest of the code...");
       TryCatch gh=new TryCatch();
        //gh.example();
    }
    void example()
    {
        int data=50/0;
        System.out.println("rest of the code...");
    }

}

