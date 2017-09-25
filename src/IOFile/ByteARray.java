package IOFile;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * Created by rohan on 9/9/17.
 */
public class ByteARray {public static void main(String[] args) {
    //byte[] b = {'h', 'e', 'l', 'l', 'o','h'};
    String t="hello , how are you!!!";
    byte b[]=t.getBytes();
    try {

        OutputStream os = new FileOutputStream("test.txt");

        InputStream is = new FileInputStream("test.txt");

        os.write(b);
        //os.write(b, 8, 14);

        for (int i = 0; b.length > i; i++) {
            System.out.print("" + (char) is.read());
        }


    } catch (Exception ex) {
        ex.printStackTrace();
    }

}
}
