/**
 * Created by mahesh on 04/08/2017.
 */
public class starperamid {
    public static void main(String[] args) {
        starperamid sc = new starperamid();
       //sc.star();
        //sc.num();
       // sc.foreach();
        //sc.star1();
        sc.star2();
    }
    void star2()
    {
        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j < 5 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <=i; k++) {
                System.out.print((k+i)+" ");
            }
            System.out.println();
        }
    }
    void star1(){
        int i,j;
        for(i=1; i<=6; i++)
        {
            for(j=1; j<i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for(i=6; i>=1; i--)
        {
            for(j=1; j<i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }


    void star() {
        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j < 5 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <=2*i-1; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    void num() {
        for (int i = 0; i <= 5; i++)
        {
            for (int j = 0; j<=i ; j++)
            {
                System.out.print(" ");
            }
            for (int k = 5; k >=i; k--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    void foreach()
    {
        String[] arr={"1","2","3","4"};
        for (String a: arr){
            System.out.print(a+"  ");
        }
    }
}