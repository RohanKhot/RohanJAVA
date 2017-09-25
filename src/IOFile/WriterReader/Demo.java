package IOFile.WriterReader;

import java.io.*;

/**
 * Created by rohan on 10/9/17.
 */
public class Demo
{
    public static void main(String[] args) throws Exception
    {
            Writer w = new FileWriter("output.txt");
            String content = "I love my country";
            w.write(content);
            w.close();
            System.out.println("Done");

            Reader reader = new FileReader("output.txt");
            int data = reader.read();
            while (data != -1)
            {
                System.out.print((char) data);
                data = reader.read();
            }
            reader.close();


    }

}
