package MultithredingDemo.Runable;

public class Run implements Runnable
{
    public void run()
    {
        System.out.println("iuf");
    }

    public static void main(String[] args) {
        Run u=new Run();
        Thread t1=new Thread(u);
        t1.start();
    }
}
