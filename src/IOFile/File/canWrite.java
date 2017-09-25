package IOFile.File;

import java.io.File;

/**
 * Created by rohan on 11/9/17.
 */
public class canWrite
{
    public static void main(String[] args) {
        File f = null;
        boolean bool = false;

        try {

            f = new File("test.txt");

            f.setWritable(true);

            bool = f.canWrite();

            System.out.println("Can write to test.txt: "+bool);

            f.setWritable(true);
            boolean bool1 = f.canRead();

            bool = f.canWrite();

            System.out.println("Can write to test.txt: "+bool);
            System.out.print("File can be read: "+bool1);

        } catch(Exception e) {

            e.printStackTrace();
        }
    }
}

