package string;

/**
 * Created by rohan on 6/9/17.
 */
public class StringToArraychar {
    public static void main(String args[]){
        String s1="i am ROHAN , limited edition";
        char[] ch=s1.toCharArray();
        for(int i=0;i<ch.length;i++){
            System.out.print(ch[i]);
        }
    }
}
