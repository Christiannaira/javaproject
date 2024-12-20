import java.util.ArrayList;
import java.util.ListIterator;


public class Main {

    public static void main(String[] args) {

        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");

        ListIterator<String> it = cars.listIterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println("---");

        while (it.hasPrevious()) {
            System.out.println(it.previous());
        }


    }

}