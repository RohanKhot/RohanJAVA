public class inheritance {
    void disp()
    {
        System.out.println("hello");

    }
}

class add extends inheritance
{
    void di()
    {
        System.out.println("hello 1");
    }
}
class div extends add
{
    void dc()
    {
        System.out.println("hello 2");
    }
    public static void main(String[] args)
    {
        div sc= new div();
        sc. disp();
        sc.di();
        sc.dc();
    }
}