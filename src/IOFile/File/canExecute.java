package IOFile.File;

import java.io.File;

/**
 * Created by rohan on 11/9/17.
 */
public class canExecute
{

    public static void main(String[] args) {
        File f = null;
        String[] strs = {"test.txt", "/test.txt"};

        try {

            for(String s:strs ) {

                f = new File(s);

                boolean bool = f.canExecute();

                String a = f.getAbsolutePath();

                System.out.print(a);

                System.out.println(" is executable: "+ bool);
            }

        } catch(Exception e) {

            e.printStackTrace();
        }
    }
}
