package IOFile.File;

/**
 * Created by rohan on 11/9/17.
 */
public class getName
{
    public static void main(String[] args) {

        getName cl = new getName();
        Class c1Class = cl.getClass();

        String name = c1Class.getName();
        System.out.println("Class Name = " + name);

    }
}
