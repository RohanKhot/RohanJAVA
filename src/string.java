public class string
{
    void literal()
    {
        String a="rohan";
        String b="rohan";
        a=a.concat("  khot");
        System.out.println(a+"\n"+b);
    }
    void New()
    {
        String c="rohan";
        String d="rohan";
        System.out.println(c+"\n"+d);

    }
void ty()
{
    String a="rohan";
    String b="rohan";
    String c=new String("rohan");
    String d=new String("rohit");
    String e=new String("rohi");

    System.out.println(a.equals(b));
    System.out.println(a.equals(c));
    System.out.println(a.equals(d));
    System.out.println("\n");

    System.out.println(a==(b));
    System.out.println(a==(c));
    System.out.println(b==(e));

    System.out.println("\n"+b.compareTo(e));
}
    public static void main(String[] args)
    {
        string ad=new string();
        ad.New();
        ad.literal();
        ad.ty();
    }
}
