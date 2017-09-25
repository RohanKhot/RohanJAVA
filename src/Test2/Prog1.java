package Test2;

/**
 * Created by rohan on 1/9/17.
 */
public class Prog1 {
    int [][] array={{1,2,3,4},{5,6,7,8},{15,21,3,41},{11,44,77,98}};

    void onee()
    {
        for (int i=0;i<4;i++)
        {
            for (int j=0;j<4;j++)
            {
                if (i==j) {
                    System.out.print(array[i][j] + "   ");
                }
                else{
                    System.out.print(" "+"   ");
                }
            }
            System.out.println();
        }

    }


    public static void main(String[] args) {
        Prog1 n=new Prog1();
        n.onee();
    }
}
