import java.util.Arrays;
import java.util.Scanner;

public class Main {

    int x;

    // Create a class constructor for the Main class
    public Main(int y) {
        x = y;
    }

    public static void main(String[] args) {

        Main myObj = new Main(5);
        System.out.println(myObj.x);

    }

}