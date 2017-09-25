package MultithredingDemo.Threadclass;

 class Priority extends Thread
{
    public void run()
    {
        System.out.println("bubble.."+Thread.currentThread().getName());
        System.out.println("bubble..Priority="+Thread.currentThread().getPriority());

    }

    public static void main(String[] args) {
        Priority t1=new Priority();
        Priority t2=new Priority();
        Priority t3=new Priority();

        System.out.println("jnj"+t1.getPriority());
        System.out.println("efasdf"+t2.getPriority());
        System.out.println("hdfwef"+t3.getPriority());

        t1.setPriority(9);
        t2.setPriority(6);
        t3.setPriority(8);

        System.out.println("jnj"+t1.getPriority());
        System.out.println("efasdf"+t2.getPriority());
        System.out.println("hdfwef"+t3.getPriority());


        t1.start();
        t2.start();
        t3.start();

    }
}
