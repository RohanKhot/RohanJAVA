import java.util.Scanner;

/**
 * Created by mahesh on 03/08/2017.
 */
public class controlstatement {
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        controlstatement controlstatement = new controlstatement();
        //controlstatement.even();
        //controlstatement.percentageCheck();
        //controlstatement.nested();
        controlstatement.evenper();
    }

    void even() {
        System.out.println("enter any no20");
        int a = scanner.nextInt();
        if (a % 2 == 0) {
            System.out.println("given no is even no");
        } else {
            System.out.println("given no is odd no");
        }
    }

    void percentageCheck(){
        System.out.println("enter the persentage=");
        int p= scanner.nextInt();
        if(p<40){
            System.out.println("fail");
        }
            else if (p>=40 && p<60){
                System.out.println("pass");}
                else if (p>=60 && p<70){
                    System.out.println("1st class");
                }
                else if (p>70){
                    System.out.println("distingtion");
                }
                else
        {
            System.out.println("invalid");
        }}

        void nested(){
        System.out.println("enter any percentage2");
        int p2 = scanner.nextInt();
                    if(p2>=40){
                        if(p2>=40 && p2<60)
                        {
                System.out.println("pass");
                        }
                        else if (p2>=60 && p2<70)
                        {
            System.out.println("1st class");
                        }
        else if (p2>=70 && p2<100)
        {
            System.out.println("distingtion");
        }
        }else{
                System.out.println("fail");
            }

    }
    void evenper(){
        System.out.println("enter the persentage=3");
        int p3=scanner.nextInt();
        if(p3>=40){
            if(p3>=40 && p3<60)
            {
                System.out.println("pass");
            }
            else if (p3>=60 && p3<70)
            {
                System.out.println("1st class");
            }
            else if (p3>=70 && p3<100)
            {
                System.out.println("distingtion");
            }
            if (p3 % 2 == 0) {
                System.out.println("given no is even no");
            } else {
                System.out.println("given no is odd no");
            }        }else{
            System.out.println("fail");
        }
    }
}
