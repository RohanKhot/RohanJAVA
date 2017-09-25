package IOFile.FileOutputStream;

import java.io.FileOutputStream;

/**
 * Created by rohan on 8/9/17.
 */
public class PrintString {
    public static void main(String[] args) {
        try {
            FileOutputStream h = new FileOutputStream("PrintString.txt");
             String t="hello , how are you!!!";
            byte b[]=t.getBytes();
            h.write(b);
            h.close();
            System.out.println("Done....");
        }catch (Exception e){
            System.out.println(e);
        }
        }
}
