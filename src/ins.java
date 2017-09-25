public class ins {
    ins(){
        System.out.println("in paresnts constractor");
    }
    {
        System.out.println("at parent, instant");
    }

}
class ins2 extends ins{
    ins2(){
        System.out.println("in child class constractor");
    }
    {
        System.out.println("at child instant");
    }

    public static void main(String[] args) {
ins2 a=new ins2();
ins b=new ins();
    }
}