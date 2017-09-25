package MultithredingDemo.Threadclass;

public class Yield implements Runnable
{
    public static void main(String[] args) {
        Yield k=new Yield();
        Thread k1=new Thread(k);
        Thread k2=new Thread(k);
        Thread k3=new Thread(k);

        k1.start();
        k2.start();
        k3.start();

    }
   public void run()
    {
        for(int i= 1;i<6;i++)
        {

        if(i%2==0)
        {
            System.out.println(Thread.currentThread().getName()+"hiiiiiiii....");
            Thread.yield();
        }}
        System.out.println("hello.......");
    }


}
