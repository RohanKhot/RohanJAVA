package IOFile.SequenceInputStream;

import java.io.FileInputStream;
import java.io.SequenceInputStream;

/**
 * Created by rohan on 9/9/17.
 */
public class ShowTwoFiles {
    public static void main(String[] args) throws Exception {
        FileInputStream gh=new FileInputStream("MyFile2.txt");
        FileInputStream fh=new FileInputStream("Buffer.txt");
        SequenceInputStream jh=new SequenceInputStream(gh,fh);
        int i;
        while ((i=jh.read())!=-1)
        {
            System.out.print((char)i);
        }
        jh.close();
        fh.close();
        gh.close();

    }
}
