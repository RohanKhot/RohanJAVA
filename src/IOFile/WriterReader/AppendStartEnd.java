package IOFile.WriterReader;

import java.io.CharArrayWriter;

/**
 * Created by rohan on 10/9/17.
 */
public class AppendStartEnd
{
    public static void main(String[] args) throws Exception {
        CharArrayWriter chw = null;


            chw = new CharArrayWriter();

            CharSequence csq = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

            chw.append(csq, 2, 5);

            System.out.println(chw.toString());

        }

}
