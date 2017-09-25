package Test2;

import java.util.Scanner;

/**
 * Created by rohan on 1/9/17.
 */
public class Prog4
{
    int[] array = {21,14,25,3,12,18};
    int[] d ={5};

    void smalle()
    {
        for (int i=1;i<=5;i++) {

             if(array[0]>array[i])
             {
                 d[0]=array[i];
                 array[0]=array[i];
                 array[0]=d[0];

             }

        }
        System.out.print(d[0]);

    }

    public static void main(String[] args) {
        Prog4 m=new Prog4();
        m.smalle();
    }
}
