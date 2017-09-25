package IOFile;

import java.io.*;

/**
 * Created by rohan on 6/9/17.
 */
public class Task1 {
    public static void main(String[] args)
    {
        Task1 tk=new Task1();
        tk.read();
        tk.copy();
    }

    void read()
    {
        try {
            FileReader reader = new FileReader("MyFile.txt");
            int character;

            while ((character = reader.read()) != -1) {
                System.out.print((char) character);
            }
            reader.close();

        } catch (IOException e)
        {
            e.printStackTrace();
        }

    }
    void copy()
    {
        {
            FileInputStream instream = null;
            FileOutputStream outstream = null;

            try
            {
                File infile = new File("MyFile.txt");
                File outfile = new File("MyFile1.txt");

                instream = new FileInputStream(infile);
                outstream = new FileOutputStream(outfile);

                byte[] buffer = new byte[1024];

                int length;

                while ((length = instream.read(buffer)) > 0)
                {
                    outstream.write(buffer, 0, length);
                }

                instream.close();
                outstream.close();

                System.out.println("File copied successfully!!");

                    }
                    catch (IOException ioe)
                    {
                ioe.printStackTrace();
                }


        }
    }
}
