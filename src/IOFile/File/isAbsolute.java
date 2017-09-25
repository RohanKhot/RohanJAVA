package IOFile.File;

import java.io.File;

/**
 * Created by rohan on 11/9/17.
 */
public class isAbsolute
{
    void d1()
    {


        // initialize File object
        File file = new File("MyFile1.txt");
        boolean result = file.isAbsolute();
        if (result) {
            System.out.println("File specified is absolute pathname");
        } else {
            System.out.println("File specified is absolute pathname absence");
        }


    }
    public static void main(String[] args) {
        isAbsolute b=new isAbsolute();
        b.d1();
        File f = null;
        String path;
        boolean bool = true;

        try {

            f = new File("test.txt");

            bool = f.isAbsolute();

            path = f.getPath();

            System.out.println(path+" is absolute? "+ bool);

            f = new File("test.txt");

            bool = f.isAbsolute();

            path = f.getPath();

            System.out.print(path+" is absolute? "+bool);

        } catch(Exception e) {

            e.printStackTrace();
        }
    }

}
