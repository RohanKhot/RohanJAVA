package Methods;

/**
 * Created by rohan on 7/9/17.
 */
public class cloneMethod implements Cloneable {

        int rollno;
        String name;

    cloneMethod(int rollno,String name){
            this.rollno=rollno;
            this.name=name;
        }

        public Object clone()throws CloneNotSupportedException{
            return super.clone();
        }

        public static void main(String args[]){
            try{
                cloneMethod s1=new cloneMethod(101,"amit");

                cloneMethod s2=(cloneMethod)s1.clone();

                System.out.println(s1.rollno+" "+s1.name);
                System.out.println(s2.rollno+" "+s2.name);

            }catch(CloneNotSupportedException c){}

        }

}
