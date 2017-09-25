package IOFile.WriterReader;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;

/**
 * Created by rohan on 10/9/17.
 */
public class Append
{
    public static void main(String[] args) throws Exception
    {
        CharSequence csq = "Hello World!";

        Writer writer = new FileWriter("writeappend.txt");


            writer.append("This is an example\n");

            writer.flush();

            writer.append(csq);

            writer.flush();

        Reader reader = new FileReader("writeappend.txt");
        int data = reader.read();
        while (data != -1)
        {
            System.out.print((char) data);
            data = reader.read();
        }
        reader.close();
        }



}
