package JAVA8;

import java.math.BigDecimal;

/**
 * Created by rohan on 13/9/17.
 */
public class Developer
{
    String name;
    int Age;

    public Developer(String name, int Salary, int Age) {
        this.name=name;
        this.Salary=Salary;
        this.Age=Age;

    }


//    public Developer(String alvin, BigDecimal bigDecimal, int i) {
//
//        name=alvin;
//        Salary=bigDecimal;
//        Age=i;
//
//    }

    @Override
    public String toString() {
        return "Developer{" +
                "name='" + name + '\'' +
                ", Age=" + Age +
                ", Salary=" + Salary +
                '}';
    }

    int Salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public int getSalary() {
        return Salary;
    }

    public void setSalary(int salary) {
        Salary = salary;
    }


}
