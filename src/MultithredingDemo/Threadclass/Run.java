package MultithredingDemo.Threadclass;

public class Run extends Thread
{
public void run()
{
    System.out.println("iuijn");
}

    public static void main(String[] args) {
        Run uu=new Run();
        uu.start();
    }
}
