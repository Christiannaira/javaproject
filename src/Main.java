import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        //familiarizing myself with Java Lists
        //ArrayList can be modified without creating a new one or copy

        ArrayList<String> cars = new ArrayList<String>();

        System.out.println(cars.isEmpty());

        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");

        System.out.println(cars.isEmpty());


    }



}