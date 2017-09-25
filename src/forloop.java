/**
 * Created by mahesh on 03/08/2017.
 */
public class
forloop {
    void no(){
        for(int i=1;i<=6;i++){
            System.out.println("hello");
        }
    }
    void nested(){
        for(int i=1;i<=5;i++){
            for(int j=1;j<=2;j++) {
                System.out.print("hello   ");
            }
            System.out.println();
        }}
    public static void main(String[] args) {
        forloop sc=new forloop();
       // sc.no();
        sc.nested();
    }
}
