package IOFile.dataInOut;

import java.io.*;

/**
 * Created by rohan on 10/9/17.
 */
public class BooleanReadWrite
{
    public static void main(String[] args) throws Exception
    {
        ByteArrayOutputStream baos = null;
        DataOutputStream dos = null;
        boolean[] bools = {true, false, false, true, true, true};



            baos = new ByteArrayOutputStream();

            dos = new DataOutputStream(baos);

            for(boolean bool: bools) {
                dos.writeBoolean(bool);
            }

            dos.flush();

            for(byte b:baos.toByteArray())
            {

                System.out.print(b);
            }


    }
}
