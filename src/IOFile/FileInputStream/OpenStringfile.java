package IOFile.FileInputStream;

import java.io.FileInputStream;

/**
 * Created by rohan on 8/9/17.
 */
public class OpenStringfile {
    public static void main(String[] args) {
        try {
            FileInputStream h= new FileInputStream("PrintString.txt");
            int i=0;
            while ((i=h.read())!=-1){
                System.out.print((char)i);
            }
            h.close();
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
