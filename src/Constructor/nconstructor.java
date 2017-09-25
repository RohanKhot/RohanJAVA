package Constructor;

/**
 * Created by rohan on 2/9/17.
 */
public class nconstructor {
    public int number;
    public int multiplication;
    public int addition;

    nconstructor()
        {
            this(5);
           System.out.println("The Default constructor");
        }

        nconstructor(int x)
        {
            this(5, 15);
            System.out.println(x);
        }

        nconstructor(int x, int y)
        {
            this(5, 15,25);

           System.out.println(x * y);
        }
    nconstructor(int x, int y,int z)
    {
        this.number=x;
        this.multiplication=y;
        this.addition=z;
        System.out.println(x+y+z);
    }

    void disp() {
        System.out.println("Number: "+number);
        System.out.println(" multiplication: "+multiplication);
        System.out.println(" addition: "+addition);
    }

        public static void main(String args[])
        {
         nconstructor m=new nconstructor();
         m.disp();
            new nconstructor();
        }
    }

