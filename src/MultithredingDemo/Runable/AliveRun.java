package MultithredingDemo.Runable;

 public class AliveRun implements Runnable
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
        AliveRun t1=new AliveRun();
        Thread t3=new Thread(t1);
        AliveRun t2=new AliveRun();
        Thread t4=new Thread(t2);
        t3.start();
        t4.start();
        System.out.println(t3.isAlive());
        System.out.println(t4.isAlive());
    }
}
