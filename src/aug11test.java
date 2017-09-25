import java.util.Scanner;

public class aug11test {
    Scanner gh=new Scanner(System.in);
    void swap(){
        System.out.println("enter any 2 number=");
        int a=gh.nextInt();
        int b=gh.nextInt();
        System.out.println("befor swap a="+a+"      b="+b);
        b=(a+b);
        a=(b-a);
        b=b-a;
        System.out.println("value of a="+a+"          b="+b);

    }
    void flag() {
        int r = 4, l = 5, p = 9;
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= l; j++) {
                if (i == 2 && j == 1) {
                    System.out.print("  ");
                    continue;
                }
                if (i == 4 && j == 1) {
                    System.out.print("  ");
                    continue;
                }

                System.out.print(" *");
            }
            for (int s = 6; s <= p; s++) {
                System.out.print(" =");
            }
            System.out.println();

        }
        for (int h = 1; h <= 2; h++)
        {
            for (int b = 1; b <= 9; b++){
                System.out.print(" =");
        }System.out.println();
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }}

    void clock()
    {
        System.out.println("enter sec=");
        int o=gh.nextInt();
        int h=o/3600;
        int p=o%3600;
        int m=p/60;
        int a=p%60;
        System.out.println(+h+":"+m+":"+a);
    }
    public static void main(String[] args)
    {
        aug11test fc=new aug11test();
        fc.flag();
        fc.swap();
        fc.clock();
    }
}
