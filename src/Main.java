
public class Main {

    public static void main(String[] args) {

        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        int[] myNum = {10, 20, 30, 40};

        System.out.println(cars[0]);
        System.out.println(myNum[0]);

        cars[0] = "Opel";
        System.out.println(cars[0]);
        System.out.println(cars);
        System.out.println(cars.length);

        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }

        for (String i: cars) {
            System.out.println(i);
        }

    }

}