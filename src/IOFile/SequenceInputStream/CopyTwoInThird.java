package IOFile.SequenceInputStream;

import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.SequenceInputStream;

/**
 * Created by rohan on 9/9/17.
 */
public class CopyTwoInThird {
    public static void main(String[] args) throws Exception {
        FileInputStream gh=new FileInputStream("MyFile2.txt");
        FileInputStream fh=new FileInputStream("Buffer.txt");
        FileOutputStream yh=new FileOutputStream("Myfile2Buffer.txt");
        SequenceInputStream jh=new SequenceInputStream(gh,fh);
        FileInputStream ij=new FileInputStream("Myfile2Buffer.txt");
        int i;
        while ((i=jh.read())!=-1)
        {
        yh.write(i);
        }

        jh.close();
        fh.close();
        gh.close();
        yh.close();
        int j;
        while ((j=ij.read())!=-1)
        {
            System.out.print((char)j);
        }



    }
}
