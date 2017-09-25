package IOFile.FileOutputStream;

import java.io.*;
import java.nio.channels.FileChannel;

/**
 * Created by rohan on 9/9/17.
 */
public class StringStartEnd {
    public static void main(String[] args) {
        FileChannel fc = null;
        FileInputStream fis = null;
        byte[] b = {'h', 'e', 'l', 'l', 'o'};
        try {
            int i = 0;
            FileInputStream s = new FileInputStream("test.txt");
            // FileOutputStream sp  = new FileOutputStream("test.txt");
            while ((i = s.read()) != -1)
            {
                 fc = s.getChannel();
                long pos = fc.position();
                System.out.print("No of bytes read: " + pos);
                System.out.println("; Char read: " + (char) i);
            }
            if(s!=null)
                s.close();
            if(fc!=null)
                fc.close();

        } catch (Exception e) {
            e.printStackTrace();
            //System.out.println("this pro");

            try {

                FileOutputStream os = new FileOutputStream("test.txt");

                InputStream is = new FileInputStream("test.txt");

                os.write(b, 0, 3);

                for (int i = 0; i < 3; i++) {

                    System.out.print("" + (char) is.read());
                }

            } catch (Exception ex) {
                ex.printStackTrace();
            }

        }
    }}
