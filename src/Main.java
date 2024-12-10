import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> cars = new ArrayList<String>();

        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars.get(0));
        System.out.println(cars.get(1));
        System.out.println(cars.get(2));
        System.out.println(cars.get(3));

        cars.add(0, "First");
        System.out.println(cars);

        cars.set(0, "Opel");
        System.out.println(cars);

        cars.remove(0);
        System.out.println(cars);

//        cars.clear();

        System.out.println(cars.size());

        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i));
        }

        for (String i : cars) {
            System.out.println(i);
        }


    }

}