package IOFile.dataInOut;

import java.io.*;

/**
 * Created by rohan on 10/9/17.
 */
public class CharWriteRead
{
    public static void main(String[] args) throws Exception
    {
        InputStream is = null;
        DataInputStream dis = null;
        FileOutputStream fos = null;
        DataOutputStream dos = null;
        byte[] buf = {65,66,67,68,69,70,55};



            fos = new FileOutputStream("chardata.txt");

            dos = new DataOutputStream(fos);

            for (byte b : buf)
            {
                dos.writeChar(b);
            }

            dos.flush();

            is = new FileInputStream("chardata.txt");

            dis = new DataInputStream(is);

            while (dis.available() > 0)
            {

                char c = dis.readChar();

                System.out.print(c);
            }

        }
    }

