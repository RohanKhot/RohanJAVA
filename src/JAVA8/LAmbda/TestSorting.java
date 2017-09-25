package JAVA8.LAmbda;

import JAVA8.Developer;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by rohan on 13/9/17.
 */
public class TestSorting
{
    public static void main(String[] args) {

        List<Developer> listDevs = getDevelopers();

        System.out.println("Before Sort");
        for (Developer developer : listDevs) {
            System.out.println(developer);
        }

        System.out.println("After Sort");

        listDevs.sort((Developer o1, Developer o2)->o1.getAge()-o2.getAge());

        listDevs.forEach((developer)->System.out.println(developer));
    }

    private static List<Developer> getDevelopers() {

        List<Developer> result = new ArrayList<Developer>();

//        result.add(new Developer("mkyong", new BigDecimal("70000"), 33));
//        result.add(new Developer("alvin", new BigDecimal("80000"), 20));
//        result.add(new Developer("jason", new BigDecimal("100000"), 10));
//        result.add(new Developer("iris", new BigDecimal("170000"), 55));
//

        result.add(new Developer("rohan",1000,33));
        result.add(new Developer("b",1000,38));
        result.add(new Developer("g",1000,35));


        return result;

    }

}
