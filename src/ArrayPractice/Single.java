package ArrayPractice;

/**
 * Created by rohan on 1/9/17.
 */
public class Single {
    void onea() {

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8};
        for (int i: array)
        {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Single m = new Single();
        m.onea();
    }
}

