package Test2;

/**
 * Created by rohan on 1/9/17.
 */
public class Prog3 {
    void doo()
    {
        String oo = "In codekul java lecture";
        StringBuilder rk = new StringBuilder();
        for (String string : oo.split(" "))
        {
            String revrk = new StringBuilder(string).reverse().toString();
            revrk =  revrk.substring(0);
            rk.append(revrk).append(" ");
        }
        System.out.println(rk.toString());

    }
    public static void main(String[] args) {
        Prog3 gh=new Prog3();
        gh.doo();

    }
}
