package IOFile.FileOutputStream;

import java.io.FileOutputStream;

/**
 * Created by rohan on 8/9/17.
 */
public class PrintAInFile {
    public static void main(String[] args) {
        try {
            FileOutputStream ut = new FileOutputStream("PrintA.txt");
            ut.write(65);

            ut.close();
            System.out.println("Done");
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
