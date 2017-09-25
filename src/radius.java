import java.util.Scanner;

public class radius
{
    Scanner ne=new Scanner(System.in);

    public static void main(String[] args)
    {
        radius h=new radius();
        h.read();
    }
    void read()
    {

        System.out.println("1.area\n2.cuircumferance\n3.volume\nenter the choice:");
        int choice = ne.nextInt();
        System.out.println("enter the numbers=");
        int i=ne.nextInt();
        switch (choice) {
            case(1):
                System.out.println("area of circule="+3.14*i*i);
                break;
            case (2):
                System.out.println("curcumferance="+2*3.14*i);
                break;
            case (3):
                System.out.println("volume of circule="+3.14*i*i*i);
                break;

            default:
                System.out.println("invalid");

    }}}

