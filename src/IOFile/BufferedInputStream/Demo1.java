package IOFile.BufferedInputStream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

/**
 * Created by rohan on 9/9/17.
 */
public class Demo1 {
    public static void main(String[] args) {
        try{
            FileInputStream gh=new FileInputStream("Buffer.txt");
            BufferedInputStream fh=new BufferedInputStream(gh);
           int i;
            while (( i=fh.read())!=-1){
                System.out.print((char)i);
            }
            fh.available();
            fh.close();
            gh.close();
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
