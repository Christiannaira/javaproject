import java.io.File;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner askUser = new Scanner(System.in);

        System.out.println("Enter user input: ");
        String userInput = askUser.nextLine();

        if (userInput.equalsIgnoreCase("Christian Naira")) {

            System.out.println("Yes, it is");

        }

    }

}