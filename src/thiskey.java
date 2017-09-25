/**
 * Created by mahesh on 10/08/2017.
 */
public class thiskey
{
    int a,b;
    String z;

    thiskey(int a,int b,String z)
    {

        this.a=a;
        this.b=b;
        this.z=z;
    }
    void  display()
    {
        System.out.println("a="+a+"  b="+b+"  z="+z);
    }
    void rohan(){
        System.out.println("its run ooo");
    }
    void khot()
    {
        rohan();
    }
    public static void main(String[] args)
    {
        thiskey tv=new thiskey(12,47,"rohan");
        tv.display();
        tv.khot();
    }
}
