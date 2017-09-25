/**
 * Created by mahesh on 10/08/2017.
 */
class A1{
    A1(){System.out.println("hello a");}
    A1(int x){
        this();
        System.out.println(x);
    }
}
class TestThis{
    public static void main(String args[]){
        A1 a=new A1(40);
    }}
