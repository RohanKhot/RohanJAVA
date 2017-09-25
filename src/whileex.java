/**
 * Created by mahesh on 08/08/2017.
 */
public class whileex {
    public static void main(String[] args) {
        whileex ne=new whileex();
        int i=0;
        while(i<9){
            System.out.println("hello");
            i++;
        }
        ne.Dowhile();

    }
    void Dowhile(){
        int i=0;
       do{
            System.out.println(" Hey hello");
            i++;
        } while(i<9);
    }
}
