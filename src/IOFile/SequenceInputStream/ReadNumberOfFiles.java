package IOFile.SequenceInputStream;

import java.io.FileInputStream;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;

/**
 * Created by rohan on 9/9/17.
 */
public class ReadNumberOfFiles {
    public static void main(String[] args) throws Exception {
        FileInputStream k = new FileInputStream("MyFile2.txt");
        FileInputStream j = new FileInputStream("Buffer.txt");
        FileInputStream h = new FileInputStream("Myfile2Buffer.txt");
        FileInputStream o = new FileInputStream("blank.txt");
        Vector e = new Vector();
        e.add(k);
        e.add(o);
        e.add(j);
        //e.add(o);
        e.add(h);
        Enumeration n = e.elements();
        SequenceInputStream d=new SequenceInputStream(n);
        int i;
        //while (n.hasMoreElements()) {
            while ((i=d.read())!=-1)
            {
                //System.out.println(n);
                System.out.print((char)i);

            }
            d.close();


        }
    }
