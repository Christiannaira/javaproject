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

        ArrayList<String> remove = new ArrayList<String>();
        remove.add("Volvo");
        remove.add("Ford");
        remove.add("Mazda");

        cars.removeAll(remove);

        System.out.println(cars);

    }



}