package InnaerClass;

/**
 * Created by rohan on 12/9/17.
 */
public class FirstDemo
{

    private int data=30;
    class Inner{
        void msg(){System.out.println("data is "+data);}
    }
    public static void main(String args[]){
        FirstDemo obj=new FirstDemo();
        FirstDemo.Inner in=obj.new Inner();
        in.msg();
    }

}
