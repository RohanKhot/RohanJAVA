package MultithredingDemo.Threadclass;

public class Sleep extends Thread
{
    public void run()
    {
        for (int i=0;i<5;i++){
        System.out.println("iuijn");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }}

    public static void main(String[] args) {
        Sleep uu=new Sleep();
        uu.start();
    }
}
