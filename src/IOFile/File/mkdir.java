package IOFile.File;

import java.io.File;

/**
 * Created by rohan on 11/9/17.
 */
public class mkdir
{
    public static void main(String[] args) {
        File f = null;
        boolean bool = false;

        try {

            // returns pathnames for files and directory
            f = new File("Texts");

            // create
            bool = f.mkdir();

            // print
            System.out.print("Directory created? "+bool);

        } catch(Exception e) {

            // if any error occurs
            e.printStackTrace();
        }
    }
}
