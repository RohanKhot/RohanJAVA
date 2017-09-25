package IOFile.dataInOut;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * Created by rohan on 10/9/17.
 */
public class Demo1
{
    public static void main(String[] args) throws Exception
    {
        FileOutputStream h=new FileOutputStream("data.txt");
        FileInputStream h1=new FileInputStream("data.txt");

        DataOutputStream k=new DataOutputStream(h);
        DataInputStream k1=new DataInputStream(h1);

        String u="Hii,how are you. Nice to meet you;;";
        byte[] u1=u.getBytes();

        k.write(u1);
        System.out.println("Write function was done....");

        k.close();

        int i=0;
        while ((i=k1.read())!=-1){
            System.out.print((char)i);
        }
        k1.close();
    }
}
