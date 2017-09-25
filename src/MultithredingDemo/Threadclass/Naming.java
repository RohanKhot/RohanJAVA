package MultithredingDemo.Threadclass;

public class Naming extends Thread {
    public void run(){
        System.out.println("running...");
    }
    public static void main(String args[]){
        Naming t1=new Naming();
        Naming t2=new Naming();
        System.out.println("Name of t2:"+t2.getName());

       // t1.start();
        //t2.start();

        t1.setName("First one=");
        t2.setName("second one=");
        System.out.println(t1.getName());
        t1.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(t2.getName());
        t2.start();
    }
}
