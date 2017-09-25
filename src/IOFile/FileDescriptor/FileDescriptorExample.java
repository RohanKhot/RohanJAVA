package IOFile.FileDescriptor;

import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * Created by rohan on 12/9/17.
 */
public class FileDescriptorExample
{
    public static void main(String[] args)
    {
        FileDescriptor fd = null;
        byte[] b = { 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58,65,66 };
        try  {
            FileOutputStream fos = new FileOutputStream("Record.txt");
            FileInputStream fis = new FileInputStream("Record.txt");
            fd = fos.getFD();
            fos.write(b);
            fos.flush();
            fd.sync();
            int value = 0;

            while ((value = fis.read()) != -1)
            {
               // char c = (char) value;
                System.out.print((char)value);
            }
            System.out.println("\nSync() successfully executed!!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}