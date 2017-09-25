package IOFile.File;

import java.io.File;

/**
 * Created by rohan on 11/9/17.
 */
public class canRead
{
    public static void main(String[] args) {
        File f = null;

        try {

            f = new File("c:/test.txt");

            boolean bool = f.canRead();

            System.out.print("File can be read: "+bool);

        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
