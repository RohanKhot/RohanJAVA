package MultithredingDemo.Threadclass;

public class Join extends Thread
{
    public void run()
    {
        System.out.print("r1 ");
        try {
            Thread.sleep(500);
        }catch(InterruptedException ie){ }
        System.out.println("r2 ");
    }
    public static void main(String[] args)
    {
        Join t1=new Join();
        Join t2=new Join();
        t1.start();

        try{
            t1.join();	//Waiting for t1 to finish
        }catch(InterruptedException ie){}

        t2.start();
    }
}
