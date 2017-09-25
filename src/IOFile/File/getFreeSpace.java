package IOFile.File;

import java.io.File;

/**
 * Created by rohan on 11/9/17.
 */
public class getFreeSpace
{
    public static void main(String[] args) {
        File f = null;
        long v;
        boolean bool = false;

        try {

            f = new File("test.txt");

            v = f.getFreeSpace();

            bool = f.exists();

            if(bool) {

                System.out.print("number of unallocated bytes: "+v);
            }

        } catch(Exception e) {

            e.printStackTrace();
        }
    }
}
