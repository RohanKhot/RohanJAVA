package IOFile.File;

import java.io.File;

/**
 * Created by rohan on 11/9/17.
 */
public class CreatFile {
    public static void main(String[] args) throws Exception {
            File f = null;
            boolean bool = false;


                f = new File("FileCreat1.txt");

                bool = f.createNewFile();

                System.out.println("File created: "+bool);

                f.delete();

                System.out.println("delete() method is invoked");

                bool = f.createNewFile();

                System.out.println("File created: "+bool);

        }
}
