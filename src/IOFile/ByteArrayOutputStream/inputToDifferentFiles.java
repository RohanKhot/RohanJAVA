package IOFile.ByteArrayOutputStream;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * Created by rohan on 9/9/17.
 */
public class inputToDifferentFiles {
    public static void main(String[] args) throws Exception {
        FileOutputStream j=new FileOutputStream("ByteArrayOutputStream1.txt");
        FileOutputStream d=new FileOutputStream("ByteArrayOutputStream2.txt");
        FileOutputStream s=new FileOutputStream("ByteArrayOutputStream3.txt");
        ByteArrayOutputStream y=new ByteArrayOutputStream();
//        y.write(65);


        String h="hiiiiiiiiiiiiiiiii";
        byte[] r=h.getBytes();
        y.write(r);
         y.writeTo(j);
        y.writeTo(d);
        y.writeTo(s);
        y.close();
        FileInputStream k=new FileInputStream("ByteArrayOutputStream2.txt");
        int i;
            while ((i=k.read())!=-1)
        {
            System.out.print((char)i);
        }
        k.close();




    }
}
