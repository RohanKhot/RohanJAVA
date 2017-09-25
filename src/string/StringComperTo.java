package string;

/**
 * Created by rohan on 4/9/17.
 */
public class StringComperTo {
    public static void main(String args[]){
        String s1="hello";
        String s2="hello";
        String s3="meklo";
        String s4="hemlo";
        String s5="hflag";
        String s6="";
        String s7=" ";

        System.out.println(s1.compareTo(s2));
        System.out.println(s1.compareTo(s3));
        System.out.println(s1.compareTo(s4));
        System.out.println(s1.compareTo(s5));
        System.out.println(s1.compareTo(s6));
        System.out.println(s1.compareTo(s7));

    }
}
