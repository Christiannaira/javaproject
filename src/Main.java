import java.util.ArrayList;
import java.util.Arrays;


public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(5);
        numbers.add(9);
        numbers.add(8);
        numbers.add(6);
        numbers.add(1);
        numbers.removeIf(n -> n % 2 == 0);
        System.out.println(numbers);



    }

}