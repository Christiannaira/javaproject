import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String[] numbers = {"1", "2", "3", "4", "5"};
        Integer[] numbers02 = {1, 2, 3, 4, 5};
        String[] numbers03 = {"1", "2", "3", "4", "6"};


//        Scanner askUser = new Scanner(System.in);
//        System.out.print("Enter your number: ");
//        String userInput = askUser.nextLine();

        if (Arrays.equals(numbers, numbers03)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

    }

}