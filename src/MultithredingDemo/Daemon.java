package MultithredingDemo;

/**
 * Created by rohan on 19/9/17.
 */
 class Daemon2 extends Thread
{
public void run()
{
    for(int i=0;i<=8;i++)
    {
        System.out.println("hii");
    }
}
}

 class Daemon1 extends Thread
{
    public void run()
    {
        for(int i=0;i<=8;i++)
        {
            System.out.println("hello");
        }
    }
}

class Daemon
{

    public static void main(String[] args) {
        Daemon1 d=new Daemon1();
        Daemon2 d1=new Daemon2();

        d.setDaemon(true);
        d.start();
        d1.start();
    }
}
