package IOFile.dataInOut;

import java.io.*;

/**
 * Created by rohan on 10/9/17.
 */
public class LongWriteread
{

    public static void main(String[] args) throws Exception
    {
        InputStream is = null;
        DataInputStream dis = null;
        FileOutputStream fos = null;
        DataOutputStream dos = null;
        long[] l = {5488489334534l,234223424334l};


            fos = new FileOutputStream("longtest.txt");

            dos = new DataOutputStream(fos);

            for(long j:l)
            {

                dos.writeLong(j);
            }

            dos.flush();

            is = new FileInputStream("longtest.txt");

            dis = new DataInputStream(is);

            while(dis.available()>0) {

                long k = dis.readLong();

                System.out.print(k+" ");
            }

        }
}
