package IOFile.BufferOut;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

/**
 * Created by rohan on 9/9/17.
 */
public class DemoWrite {
    public static void main(String[] args) throws Exception {
        FileOutputStream gh=new FileOutputStream("Buffer.txt");
        BufferedOutputStream fh=new BufferedOutputStream(gh);
        String j="Welcome to buffer,,,,,,,,,,,";
        byte b[]=j.getBytes();
       // fh.write(b);
       fh.write(b,4,18);
        //fh.flush();
fh.close();
gh.close();
        System.out.println("DONE.....");
    }
}
