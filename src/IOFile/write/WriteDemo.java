package IOFile.write;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;

/**
 * Created by rohan on 10/9/17.
 */
public class WriteDemo {
    public static void main(String[] args) {
        String str = "Hello world!";

        Writer writer = new PrintWriter(System.out);

        try {

            writer.write(str);

            writer.flush();

            writer.write("\nThis is an example");

                writer.flush();

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
