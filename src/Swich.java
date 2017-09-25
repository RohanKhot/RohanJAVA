import java.util.Scanner;

/**
 * Created by mahesh on 04/08/2017.
 */
public class Swich {
    Scanner dc=new Scanner(System.in);

    public static void main(String[] args) {
        Swich sc = new Swich();
       // sc.cas();
        //sc.ari();
        sc.autointe();
    }
    void cas()
    {
        int i;
        i=dc.nextInt();
        switch (i) {
            case(1):
                System.out.println("hii");
                break;
            case (2):
                System.out.println("rohan");
                break;
            case (3):
                System.out.println("rajan");
                break;

                default:
                    System.out.println("invalid");

        }
        }

        void ari() {
            System.out.println("1.addition\n2.subrtaction\n3.multipication\n4.division\nenter the choice:");
            int choice = dc.nextInt();
            System.out.println("enter the numbers=");
            int a = dc.nextInt();
            int b = dc.nextInt();
            switch (choice) {
                case (1):
                    System.out.println(a + b);
                    break;
                case (2):
                    System.out.println(a - b);
                    break;
                case (3):
                    System.out.println(a * b);
                    break;
                case (4):
                    System.out.println(a / b);
                    break;

                default:
                    System.out.println("invalid input");

            }

        }
    void autointe() {
        System.out.println("1.addition\n2.subrtaction\n3.multipication\n4.division\nenter the choice:");
        int choice = dc.nextInt();
        System.out.println("how many of no u want 2 give(upto 10):");
        int g=dc.nextInt();
        int[] array=new int[10];
            System.out.println("enter the numbers=");
        for(int i=1;i<=g;i++)
                {
                array[i]=dc.nextInt();
                }
        int j=0;    int d=1;
        switch (choice) {
                case (1):
                    for (int  h: array) {

                        j=j+h;

                    }
                    System.out.println(j);
                    break;
                case (2):
                    for (int  h: array) {
                        j=j-h;
                        j=-j;
                    } System.out.println(j);
                    break;
                case (3):
                    for (int  h: array) {

                        d=d*h;
                    }System.out.println(d);
                    break;
               /* case (4):
                    for (int  h: array) {
                        int j=0;
                        int j=j+h;
                        System.out.println(j);

                    }                    break; */

                default:
                    System.out.println("invalid input");

            }
        }
    }

