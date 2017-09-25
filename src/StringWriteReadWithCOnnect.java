import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

/**
 * Created by rohan on 12/9/17.
 */
public class StringWriteReadWithCOnnect
{
    public static void main(String[] args)  throws Exception
    {
        PipedOutputStream p=new PipedOutputStream();
        PipedInputStream p1=new PipedInputStream();

        p.connect(p1);

        FileOutputStream h = new FileOutputStream("PrintString.txt");
        String t="hello , how are you!!!";
        byte b[]=t.getBytes();
        h.write(b);
        h.close();
        System.out.println("Done....");
        FileInputStream h1= new FileInputStream("PrintString.txt");
        int i=0;
        while ((i=h1.read())!=-1){
            Thread.sleep(1000);

            System.out.print((char)i);
        }
        h.close();

    }
}
