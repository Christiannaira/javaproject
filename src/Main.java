import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");

        ArrayList<String> brands = new ArrayList<String>();
        brands.add("Microsoft");
        brands.add("W3Schools");
        brands.add("Apple");

        brands.addAll(cars);

        brands.clear();

        System.out.println(brands);

    }

}