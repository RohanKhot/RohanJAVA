/**
 * Created by mahesh on 10/08/2017.
 */
class A{
    A(){System.out.println("hello a");}
    A(int x){
        this();
        System.out.println(x);
    }
}
class TestThis6{
    public static void main(String args[]){
        A a=new A(40);
    }}
class TestThis5{
    public static void main(String args[]){
        A b=new A(10);
    }}

