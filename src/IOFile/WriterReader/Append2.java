package IOFile.WriterReader;

import java.io.BufferedWriter;
import java.io.StringWriter;

/**
 * Created by rohan on 10/9/17.
 */
public class Append2
{

    public static void main(String[] args) throws Exception {

        StringWriter sw = null;
        BufferedWriter bw = null;

        CharSequence csq = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

            sw = new StringWriter();

            bw = new BufferedWriter(sw);

            bw.append(csq, 5, 11);
            bw.append(" :");
            bw.append(csq, 3, 7);
            bw.append(" ");
            bw.append(csq, 2, 8);

            bw.flush();

            StringBuffer sb = sw.getBuffer();

            System.out.println(sb);

        }
}
