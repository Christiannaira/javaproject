import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Spliterator;

public class Main {

    public static void main(String[] args) {

        //familiarizing myself with Java Lists
        //ArrayList can be modified without creating a new one or copy

        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");

        Spliterator<String> it1 = cars.spliterator();
        Spliterator<String> it2 = it1.trySplit();

        System.out.println("First spliterator");
        while (it1.tryAdvance((n) -> {
            System.out.println(n);
        }));

        System.out.println("\nSecond spliterator");
        while (it2.tryAdvance((n) -> {
            System.out.println(n);
        }));

    }



}