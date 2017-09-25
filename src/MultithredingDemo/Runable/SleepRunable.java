package MultithredingDemo.Runable;

class Sleep implements Runnable
{
    public void run()
    {
        for (int i=0;i<5;i++)
        {
            System.out.println("hii how are u");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Sleep u=new Sleep();
        Thread t1=new Thread(u);
        t1.start();
    }
}
