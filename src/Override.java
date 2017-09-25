/**
 * Created by rohan on 1/9/17.
 */
public class Override
{
    public void eat()
    {
        System.out.println("Human is eating");
    }
}
    class Boy extends Override
    {
        public void eat()
        {
            super.eat();
            System.out.println("Boy is eating");
        }
        public static void main( String args[])
        {
            Boy obj = new Boy();
            obj.eat();
        }
    }
class ABC{
    public void disp()
    {
        System.out.println("disp() method of parent class");
    }
    public void abc()
    {
        System.out.println("abc() method of parent class");
    }
}
class Test extends ABC
{
    public void disp()
    {
        System.out.println("disp() method of Child class");
    }
    public void xyz()
    {
        System.out.println("xyz() method of Child class");
    }
    public void main(String args[])
    {
        ABC obj = new Test();
        obj.disp();
        obj.abc();
super.disp();
    }
}