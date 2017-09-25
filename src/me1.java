import java.io.FileOutputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

/**
 * Created by rohan on 12/9/17.
 */
public class me1 {
    public static void main(String args[]) throws Exception {
        final PipedOutputStream pout = new PipedOutputStream();
        final PipedInputStream pin = new PipedInputStream();

        pout.connect(pin);

        FileOutputStream h = new FileOutputStream("PrintString1.txt");
        String t="hello , how are you!!!";
        byte b[]=t.getBytes();
        h.write(b);
        h.close();
        System.out.println("Done....");

        Thread t1=new Thread(){
            public void run(){
                for(int i=0;i<=b.length;i++){
                    try{
                        pout.write(t.getBytes());
                        Thread.sleep(1000);
                    }catch(Exception e){}
                }
            }
        };
        Thread t2=new Thread(){
            public void run(){
                try{
                    for(int i=0;i<=b.length;i++)
                        System.out.println(pin.read());
                }catch(Exception e){}
            }
        };
        t1.start();
        t2.start();
    }
}