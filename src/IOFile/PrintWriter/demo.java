package IOFile.PrintWriter;

import java.io.File;
import java.io.PrintWriter;

/**
 * Created by rohan on 10/9/17.
 */
public class demo
{
    public static void main(String[] args) throws Exception {
        PrintWriter writer = new PrintWriter(System.out);
        writer.write("Javatpoint provides tutorials of all technology.");
        writer.flush();
        writer.close();


        PrintWriter writer1 =null;
        writer1 = new PrintWriter(new File("testout1.txt"));
        writer1.write("Like Java, Spring, Hibernate, Android, PHP etc.");
        writer1.flush();
        writer1.close();
    }

}
