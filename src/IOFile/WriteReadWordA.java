package IOFile;

import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * Created by rohan on 8/9/17.
 */
public class WriteReadWordA {
    void write()
    {

        try {
            FileOutputStream ut = new FileOutputStream("PrintA.txt");
            ut.write(65);
            ut.close();
            System.out.println("Done.......");
        }catch (Exception e){
            System.out.println(e);
        }
    }
    void read()
    {
        try {
            FileInputStream h=new FileInputStream("PrintA.txt");
            int i =h.read();

            System.out.println((char)i);
            h.close();

        }catch (Exception e){
            System.out.println(e);
        }

    }

    public static void main(String[] args) {
        WriteReadWordA h=new WriteReadWordA();
        h.write();
        h.read();
    }
}
