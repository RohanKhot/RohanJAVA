package IOFile.FilterWriter;

import java.io.*;

/**
 * Created by rohan on 11/9/17.
 */
class CustomFilterWriter extends FilterWriter {
    CustomFilterWriter(Writer out) {
        super(out);
    }
    public void write(String str) throws IOException {
        super.write(str.toLowerCase());
    }
}
public class FilterWriterExample {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("text.txt");
            CustomFilterWriter filterWriter = new CustomFilterWriter(fw);
            filterWriter.write("I LOVE MY COUNTRY");
            filterWriter.close();
            FileReader fr = new FileReader("testout1.txt");
            BufferedReader bufferedReader = new BufferedReader(fr);
            int k;
            while ((k = bufferedReader.read()) != -1) {
                System.out.print((char) k);
            }
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}