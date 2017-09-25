/**
 * Created by mahesh on 09/08/2017.
 */
public class staticmethod {

    void Static(){
        System.out.println("in method");
    }
    static void method()
    {
        System.out.println("in static method");
    }
    static {
        System.out.println("in static");
    }

    public static void main(String[] args) {
        staticmethod.method();

        staticmethod ty=new staticmethod();
        ty.Static();
    }
}
