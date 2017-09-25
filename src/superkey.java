
    class Animal{
    Animal(){
        System.out.println("created...");


    }
        String color="white";
        void eat(){System.out.println("eating...");}

    }
class Dog extends Animal{
    String color="black";
    Dog(){
        super();
        System.out.println("crated. Dog..");
    }
    void printColor(){
        System.out.println(color);
        System.out.println(super.color);
        super.eat();
    }
}
class superkey{
    public static void main(String args[]){
        Dog d=new Dog();
        d.printColor();

    }}