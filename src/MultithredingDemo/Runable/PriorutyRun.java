package MultithredingDemo.Runable;

public class PriorutyRun implements Runnable
{
    public void run()
    {
        System.out.println("bubble.."+Thread.currentThread().getName());
        System.out.println("bubble..Priority="+Thread.currentThread().getPriority());

    }

    public static void main(String[] args) {
        PriorutyRun t1=new PriorutyRun();
        PriorutyRun t2=new PriorutyRun();
        PriorutyRun t3=new PriorutyRun();//git

        Thread t4=new Thread(t1);
        Thread t5=new Thread(t2);
        Thread t6=new Thread(t3);

        t4.setName("1");
        t5.setName("2");
        t6.setName("3");

//        System.out.println("jnj"+t4.getPriority());
//        System.out.println("efasdf"+t5.getPriority());
//        System.out.println("hdfwef"+t6.getPriority());

        t4.setPriority(9);
        t5.setPriority(6);
        t6.setPriority(8);

        System.out.println("jnj"+t4.getPriority());
        System.out.println("efasdf"+t5.getPriority());
        System.out.println("hdfwef"+t6.getPriority());


        t4.start();
        t5.start();
        t6.start();

    }
}
