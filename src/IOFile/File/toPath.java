package IOFile.File;

import java.io.File;

/**
 * Created by rohan on 11/9/17.
 */
public class toPath
{
    public static void main(String[] args) throws Exception {

        try {
            File file = new File("/home/rohan/Pictures/test.txt");
            System.out.println(file.toPath());
            System.out.println(file.toPath().getClass());

        } catch (Exception e) {
            System.err.println("Things went wrong: " + e.getMessage());
            e.printStackTrace();

        } finally {

        }
    }
}
