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

        ArrayList cars2 = (ArrayList)cars.clone();
        cars2.set(0, "Toyota");

        System.out.println(cars);
        System.out.println(cars2);


    }



}