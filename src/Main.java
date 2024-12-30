import java.util.*;

public class Main {

    public static void main(String[] args) {

        String[] fruits = {"Banana", "Orange", "Apple", "Mango"};
        Arrays.fill(fruits, 2, 4, "Kiwi");

        for (String i : fruits) {
            System.out.println(i);
        }

        

    }



}