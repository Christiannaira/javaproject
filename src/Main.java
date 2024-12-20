import java.util.ArrayList;
import java.util.Arrays;


public class Main {

    public static void main(String[] args) {

        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        cars.add("Toyota");

        ArrayList<String> remove = new ArrayList<String>();
        remove.add("Volvo");
        remove.add("Ford");
        remove.add("Mazda");

        cars.removeAll(remove);

        System.out.println(cars);


    }

}