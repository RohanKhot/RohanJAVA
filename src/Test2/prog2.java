package Test2;

/**
 * Created by rohan on 1/9/17.
 */
public class prog2 {int [][] array={{1,2,3,4},{5,6,7,8},{1,2,3,4},{5,6,7,8}};
int tem=0;
    void onee()
    {
        for (int i=0;i<4;i++)
        {
            for (int j=0;j<=3;j++)
            {
                if (i+j==4-1) {
                    System.out.print(array[i][j] + " ");
                }
                else{
                    System.out.print(" "+" ");
                }
            }
            System.out.println();
        }

    }


    public static void main(String[] args) {
        prog2 n=new prog2();
        n.onee();
    }
}
