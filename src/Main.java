import java.util.Arrays;
import java.util.Scanner;

public class Main {

    int modelYear;
    String modelName;

    // Create a class constructor for the Main class
    public Main(int year, String name) {
        this.modelYear = year;
        this.modelName = name;
    }

    public static void main(String[] args) {

        Main myCar = new Main(1969, "Mustang");
        System.out.println(myCar.modelYear + " " + myCar.modelName);

    }

}