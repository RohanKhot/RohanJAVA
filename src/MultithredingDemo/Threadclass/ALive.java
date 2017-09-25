package MultithredingDemo.Threadclass;

public class ALive extends Thread
{
    public void run()
    {
        System.out.println("r1 ");
        try {
            Thread.sleep(500);
        }
        catch(InterruptedException ie) { }
        System.out.println("r2 ");
    }
    public static void main(String[] args)
    {
        ALive t1=new ALive();
        ALive t2=new ALive();
        t1.start();
        t2.start();
        System.out.println(t1.isAlive());
        System.out.println(t2.isAlive());
    }
}
