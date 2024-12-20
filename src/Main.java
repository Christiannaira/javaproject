import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        String[] fruits = {"Banana", "Orange", "Apple", "Mango"};
        Arrays.fill(fruits, "Kiwi");

        for (String i: fruits) {
            System.out.println(i);
        }

    }

}