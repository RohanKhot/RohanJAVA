package IOFile.FileInputStream;

import java.io.FileInputStream;

/**
 * Created by rohan on 8/9/17.
 */
public class OpenAFile {
    public static void main(String[] args) {
        try {
            FileInputStream h=new FileInputStream("PrintA.txt");
            int i =h.read();

            System.out.println((char)i);
            h.close();

        }catch (Exception e){
            System.out.println(e);
        }
    }
}
