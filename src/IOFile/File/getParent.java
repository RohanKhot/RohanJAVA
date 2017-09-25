package IOFile.File;

import java.io.File;

/**
 * Created by rohan on 11/9/17.
 */
public class getParent
{
    public static void main(String[] args) {
        File f = null;
        String v;
        boolean bool = false;

        try {

            // create new file
            f = new File("/home/rohan/Pictures/test.txt");

            // get file name or directory name
            v = f.getParent();

            // true if the file path exists
            bool = f.exists();

            // if file exists
            if(bool) {

                // prints
                System.out.print("parent name: "+v);
            }

        } catch(Exception e) {

            // if any error occurs
            e.printStackTrace();
        }
    }
}
