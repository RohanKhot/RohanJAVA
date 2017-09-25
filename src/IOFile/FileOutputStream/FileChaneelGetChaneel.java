package IOFile.FileOutputStream;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;

/**
 * Created by rohan on 9/9/17.
 */
public class FileChaneelGetChaneel {public static void main(String[] args) throws IOException {
    FileChannel fc = null;
    FileInputStream fis = null;
    int i = 0;
    long pos;
    char c;

    try {

        fis = new FileInputStream("test.txt");

        while((i = fis.read())!=-1) {

            fc = fis.getChannel();

            pos = fc.position();

            c = (char)i;

            System.out.print("No of bytes read: "+pos);
            System.out.println("; Char read: "+c);
        }

    } catch(Exception ex) {

        System.out.println("IOException: close called before read()");
    } finally {

        if(fis!=null)
            fis.close();
        if(fc!=null)
            fc.close();
    }
}
}
