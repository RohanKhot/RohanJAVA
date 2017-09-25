package IOFile;

import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * Created by rohan on 8/9/17.
 */
public class WriteReadString {
    void write()
    {

        try {
            FileOutputStream h = new FileOutputStream("PrintString.txt");
            String t="hello , how are you!!!";
            byte b[]=t.getBytes();
            h.write(b);
            h.close();
            System.out.println("Done....");
        }catch (Exception e){
            System.out.println(e);
        }
    }
    void read()
    {
        try {
            FileInputStream h= new FileInputStream("PrintString.txt");
            int i=0;
            while ((i=h.read())!=-1){
                System.out.print((char)i);
            }
            h.close();
        }catch (Exception e){
            System.out.println(e);
        }

    }

    public static void main(String[] args) {
WriteReadString h=new WriteReadString();
        h.write();
        h.read();
    }
}
