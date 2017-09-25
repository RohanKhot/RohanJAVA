public class RunTimePol
{
    void eat()
    {
        System.out.println("eat");
    }
}
class dog extends RunTimePol{
    void eat()
        {
        System.out.println("dog is eating");
        }
//public static void main(String[]args)
//        {
//        RunTimePol gh=new dag();
//        gh.eat();
//        }
}
class cat extends RunTimePol{
    void eat(){
        System.out.println("cat is eating");
    }

    public static void main(String[] args) {
        RunTimePol gh=new cat();
        RunTimePol fh=new dog();
        gh.eat();
        fh.eat();

    }
        }
