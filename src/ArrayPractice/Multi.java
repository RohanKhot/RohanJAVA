package ArrayPractice;

/**
 * Created by rohan on 1/9/17.
 */
public class Multi {
    void inp(){
        int [][] array={{1,2,3,4},{1,4,7,8},{1,2,3,4},{1,4,7,8}};
        for (int i=0;i<4;i++)
        {
            for (int j=0;j<4;j++)
            {
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        Multi g=new Multi();
        g.inp();
    }
}
