package IOFile.FileOutputStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * Created by rohan on 9/9/17.
 */
public class BlankFile {
    public static void main(String[] args) throws Exception {
        FileOutputStream l=new FileOutputStream("blank.txt");
        FileInputStream j =new FileInputStream("blank.txt");

        String t="T";
        byte b[]=t.getBytes();
        l.write(b);
        l.close();
        int i=j.read();
        System.out.println((char)i);
        j.close();
    }
}
