package string;

/**
 * Created by rohan on 6/9/17.
 */
public class StringGetChar {
    public static void main(String[] args) {
        String st="i am studing at codekul";
        char [] ch=new char[15];
        try{ st.getChars(3, 16, ch, 0);
            System.out.println(ch);
        }catch(Exception ex){System.out.println(ex);}


        }


}
