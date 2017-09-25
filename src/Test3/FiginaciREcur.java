package Test3;

/**
 * Created by rohan on 8/9/17.
 */
public class FiginaciREcur {
    static int n1=0,n2=1,n3=0;
    static void printFibo(int g){
        if(g>0){
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            System.out.print(" "+n3);
            printFibo(g-1);
        }
    }

    public static void main(String[] args) {
        int g=20;
        System.out.println(n1+" "+n2);
        printFibo(g-2);
    }

}
