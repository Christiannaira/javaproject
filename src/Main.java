import java.util.ArrayList;


public class Main {

    public static void main(String[] args) {

        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("Ford");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");

        System.out.println(cars.indexOf("Ford"));
        System.out.println(cars.lastIndexOf("Ford"));


    }

}