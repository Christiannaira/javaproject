import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);

        try {

            System.out.println("Enter your age: ");
            int age = myObj.nextInt();

            System.out.println("age: " + age);

        } catch (Exception e) {

            System.out.println("error");

        }

    }

}

