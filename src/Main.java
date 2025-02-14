import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {

        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        int[] myNum = {10, 20, 30, 40};

        System.out.println(cars[0]);
        System.out.println(cars[1]);
        System.out.println(cars[2]);
        System.out.println(cars[3]);

        myNum[0] = 20;

        System.out.println(myNum[0]);
        System.out.println(myNum[1]);
        System.out.println(myNum[2]);
        System.out.println(myNum[3]);

        System.out.println(cars.length);



    }

}

