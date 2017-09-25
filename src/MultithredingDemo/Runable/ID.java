package MultithredingDemo.Runable;

public class ID implements Runnable
{
    Thread t;
    Thread t1;
    ID(){

        // thread created
        t = new Thread(this, "Admin Thread");

         t1=new Thread(this,"rohan");

        // set thread priority
        t.setPriority(1);
        t1.setPriority(6);

        // prints thread created
        System.out.println("thread  = " + t);
        System.out.println("thread  = " + t1);


        // this will call run() function
        t.start();
       // t1.start();
    }

    public void run() {

        // returns the identifier of this Thread.
        System.out.println("Name = " +t1.getName());
        System.out.println("Id = " + t1.getId());

        System.out.println("Name = " +t.getName());
        System.out.println("Id = " + t.getId());
    }

    public static void main(String args[]) {
        new ID();
    }
}
