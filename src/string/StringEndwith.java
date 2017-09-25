package string;

/**
 * Created by rohan on 4/9/17.
 */
public class StringEndwith {
    public static void main(String args[]){
        String name="what do you know about me";
        System.out.println(name.endsWith("about"));
        System.out.println(name.endsWith("me"));
        System.out.println(name.endsWith("e"));
        System.out.println(name.endsWith(" me"));

    }
}
