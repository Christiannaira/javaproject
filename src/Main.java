import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        //familiarizing myself with Java Lists
        //ArrayList can be modified without creating a new one or copy

        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");

        System.out.println(cars);
        System.out.println(" ");
        for (String car : cars) {
            System.out.println(car);
        }

        System.out.println(" ");
        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i));
        }

    }

}