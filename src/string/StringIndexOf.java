package string;

/**
 * Created by rohan on 6/9/17.
 */
public class StringIndexOf {
    public static void main(String[] args) {
        String s1="this that pushpak of example";

        int index1=s1.indexOf("of");
        int index2=s1.indexOf("pushpak");
        System.out.println(index1+"  "+index2);

        int index3=s1.indexOf("of",4);
        System.out.println(index3);

        int index4=s1.indexOf('s');
        System.out.println(index4);
    }
}
