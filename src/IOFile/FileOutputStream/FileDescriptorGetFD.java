package IOFile.FileOutputStream;

import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by rohan on 9/9/17.
 */
public class FileDescriptorGetFD {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = null;
        FileDescriptor fd = null;
        boolean bool = false;

        try {

            fos = new FileOutputStream("test.txt");

            fd = fos.getFD();

            bool = fd.valid();

            System.out.print("Is file valid? "+bool);

        } catch(Exception ex) {

            ex.printStackTrace();
        } finally {
            if(fos!=null)
                fos.close();
        }
    }
}
