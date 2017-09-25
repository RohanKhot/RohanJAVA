package string;

/**
 * Created by rohan on 6/9/17.
 */
public class StringByte {
    public static void main(String[] args) {
        String st="codekul";
            byte[] st1=st.getBytes();
            for (int i=0;i<st1.length;i++)
            {
                System.out.println(st1[i]);
            }
    }
}
