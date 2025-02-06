
import java.lang.Character;
import java.lang.String;
import java.util.Scanner;

class Main {


    public static void main(String[] args) {

        Scanner askUser = new Scanner(System.in);

        System.out.print("Enter your username: ");
        String userName = askUser.nextLine();

        for (int i = 0; i < userName.length(); i++) {

            if (Character.isLetter(userName.charAt(i))) {

                System.out.println(userName.charAt(i) + " is Letter");

            } else if (Character.isDigit(userName.charAt(i))) {

                System.out.println(userName.charAt(i) + " is Digit");

            } else if (Character.isLetterOrDigit(userName.charAt(i))) {

                System.out.println(userName.charAt(i) + " is both Letter and Digit");

            }

        }


    }

}

