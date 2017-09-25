package IOFile.FilterWriter;

import java.io.FilterWriter;
import java.io.StringWriter;
import java.io.Writer;

/**
 * Created by rohan on 12/9/17.
 */
public class WriteString
{
    public static void main(String[] args) throws Exception {
        FilterWriter fw = null;
        Writer w = null;
        String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String s = null;

        try {

            w = new StringWriter();

            fw = new FilterWriter(w) {
            };

            fw.write(str, 0, 26);

            s = w.toString();

            System.out.print("String: "+s);

        } catch(Exception e) {

            e.printStackTrace();
        } finally {

            if(w!=null)
                w.close();
            if(fw!=null)
                fw.close();
        }
    }

}
