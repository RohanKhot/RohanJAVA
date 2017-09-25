package IOFile;

import java.io.FileReader;
import java.io.IOException;

/**
 * Created by rohan on 6/9/17.
 */
public class ReadFile {
    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader("MyFile1.txt");
            int character=0;
            char ch=0;
            while ((character = reader.read()) != -1) {
               // System.out.print((char) character);
            StringBuilder sp=new StringBuilder((char) character);
            sp.append((char) character);
                System.out.print(sp);
            }
            reader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
