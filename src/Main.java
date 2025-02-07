
import java.lang.Character;
import java.lang.String;
import java.util.Scanner;

class Main {


    public static void main(String[] args) {

        Scanner askUser = new Scanner(System.in);

        System.out.print("Enter your username: ");
        String userName = askUser.nextLine();

        for (int i = 0; i < userName.length(); i++) {

            if (Character.isUpperCase(userName.charAt(i))) {
                System.out.println(userName.charAt(i) + " is uppercase");
            } else if (Character.isLowerCase(userName.charAt(i))) {
                System.out.println(userName.charAt(i) + " is lowercase");
            } else if (Character.isWhitespace(userName.charAt(i))) {
                System.out.println(userName.charAt(i) + " is whitespace");
            } else if (Character.isDigit(userName.charAt(i))) {
                System.out.println(userName.charAt(i) + " is digit");
            }

        }


    }

}

