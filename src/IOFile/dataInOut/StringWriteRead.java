package IOFile.dataInOut;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

/**
 * Created by rohan on 10/9/17.
 */
public class StringWriteRead
{



    public static void main(String[] args) throws Exception {
        //ByteArrayOutputStream baos = null;

        DataOutputStream dos = null;
        String s = "Hello World!!";


            //baos = new ByteArrayOutputStream();

            FileOutputStream k=new FileOutputStream("Stringdata.txt");


            dos = new DataOutputStream(k);

            dos.writeBytes(s);

            dos.flush();

            System.out.println(s+" in bytes:");

//            for(byte b:baos.toByteArray())
//            {
//
//                System.out.print(b + ",");
//            }


    }
}
