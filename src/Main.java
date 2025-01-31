import java.util.Scanner;

public abstract class Main {

    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);
        String userName;

        System.out.println("Enter userName");
        userName = myObj.nextLine();

        System.out.println("Username is: " + userName);

    }

}
