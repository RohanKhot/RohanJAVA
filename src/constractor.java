/**
 * Created by mahesh on 09/08/2017.
 */
public class constractor
    {
        static public  void main(String[] args)
    {
        constractor con=new constractor(1,2);
        constractor con1=new constractor(1,2,"rohan");
    }
    constractor(int a,int b)
    {
        int d,e;
        d=a;
        e=b;

        System.out.println("d="+d+"  "+"e="+e);
    }
    constractor(int f,int g,String h)
    {
        int i=f;
        int j=g;
        String k=h;
        System.out.println("f="+i+"   g="+j+"  h="+k);
    }
}
