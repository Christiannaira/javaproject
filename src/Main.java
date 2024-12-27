import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        //familiarizing myself with Java Lists
        //ArrayList can be modified without creating a new one or copy

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

        System.out.println(brands);
        System.out.println(cars);





    }

}