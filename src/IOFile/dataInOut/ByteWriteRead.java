package IOFile.dataInOut;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;

/**
 * Created by rohan on 10/9/17.
 */
public class ByteWriteRead
{
    public static void main(String[] args) throws Exception {
    ByteArrayOutputStream baos = null;
    DataOutputStream dos = null;
    byte[] buf = {12, 15, 30, 40, 5, 7};


        baos = new ByteArrayOutputStream();

        dos = new DataOutputStream(baos);

        for(byte b: buf)
        {
            dos.writeByte(b);
        }

        dos.flush();

        for(byte b:baos.toByteArray())
        {

            System.out.print(b + " ");
        }

    }
}
