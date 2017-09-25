package IOFile.File;

import java.io.File;

/**
 * Created by rohan on 11/9/17.
 */
public class listFiles
{
    public static void main(String[] args) {
        File f = null;
        File[] paths;

        try {

            f = new File("/home/rohan/Documents/Intelij/idprogram/rajan3aug");

            paths = f.listFiles();

            for(File path:paths) {

                System.out.println(path);
            }

        } catch(Exception e) {

            e.printStackTrace();
        }
    }
}
