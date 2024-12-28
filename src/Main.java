import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Main {

    public static void main(String[] args) {

        //familiarizing myself with Java Lists
        //ArrayList can be modified without creating a new one or copy

        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        cars.add("Ford");

        ArrayList<String> valid = new ArrayList<String>();
        valid.add("Volvo");
        valid.add("Ford");
        valid.add("Mazda");

        cars.retainAll(valid);

        System.out.println(cars);

    }



}