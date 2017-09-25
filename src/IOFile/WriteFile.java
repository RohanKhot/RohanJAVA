package IOFile;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by rohan on 6/9/17.
 */
public class WriteFile {

    public static void main(String[] args) {
        try {

            FileWriter writer = new FileWriter("MyFile.txt", true);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);

            bufferedWriter.write("Hello World");
            bufferedWriter.newLine();
            bufferedWriter.write("See You Again!");
            bufferedWriter.newLine();
            bufferedWriter.write("See You Again2!");

            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
