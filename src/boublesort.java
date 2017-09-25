import java.util.Scanner;

/**
 * Created by mahesh on 08/08/2017.
 */
public class boublesort {int i;
    Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        boublesort gh= new boublesort();
        gh.bouble_assendig();
       gh.deseding();
        //gh.show();

    }

        void bouble_assendig()
        {
        System.out.println("Enter total amount of numbers:" );
        int n = input.nextInt();
        int [] numbers = new int[n];

        System.out.println("Enter the numbers: "+" ");
        for (int i = 0; i < n; i++)
        {
            numbers[i] = input.nextInt();
        }

        for (int j = 0; j<numbers.length; j++)
        {
        System.out.print(numbers[j]+"\n");
        }
        for (int k = 0; k<numbers.length; k++){
        int l=numbers.length;
        int temp=0;
        for(int m=0;m<=l;m++){
         for (int o=1;o<(l-m);o++){
             if(numbers[o-1]>numbers[o]){
                 temp=numbers[o-1];
                 numbers[o-1]=numbers[o];
                 numbers[o]=temp;
             }
         }
      }

        }
            System.out.println("\n Array After Bubble Sort");
            for(int i=0; i < numbers.length; i++){
                System.out.print(numbers[i] + " ");
            }

    }

    void deseding(){
        System.out.println("\n Enter total amount of numbers:" );
        int n = input.nextInt();
        int [] numbers = new int[n];
        System.out.print("Enter the numbers: "+" ");
        for (int i = 0; i < n; i++)
        {
            numbers[i] = input.nextInt();
        }
        for (int j = 0; j<numbers.length; j++)
        {
            System.out.print(numbers[j]+"  ");
        }        for (int k = 0; k<numbers.length; k++){
            int l=numbers.length;
            int temp=0;
            for(int m=0;m<=l;m++){
                for (int o=1;o<(l-m);o++){
                    if(numbers[o-1]<numbers[o]){
                        temp=numbers[o-1];
                        numbers[o-1]=numbers[o];
                        numbers[o]=temp;
                    }
                }
            }

    }
        System.out.println("\n Array in desending form");
        for(int i=0; i < numbers.length; i++){
            System.out.print(numbers[i] + " ");
        }
}}
