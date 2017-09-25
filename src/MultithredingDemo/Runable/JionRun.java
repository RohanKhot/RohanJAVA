package MultithredingDemo.Runable;

public class JionRun implements Runnable
{
    public void run()
    {
        System.out.print("heee");
        try {
            Thread.sleep(600);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(" sorry!!!!");
    }

    public static void main(String[] args) {
      JionRun k=new JionRun();
      Thread k1=new Thread(k);
        JionRun k2=new JionRun();
        Thread k3=new Thread(k2);
      k1.start();

        try {
            k1.join(500);
           // Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


      k3.start();



    }
}
