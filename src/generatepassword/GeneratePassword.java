package generatepassword;

import java.util.Scanner;
import java.lang.Character;
import java.lang.String;

public class GeneratePassword {

    public boolean checkPassword(String password) {

        boolean upperCase = false;
        boolean lowerCase = false;
        boolean digit = false;

        if (password.length() >= 8) { //Minimum 8 characters

            for (int i = 0; i < password.length(); i++) {

                char ch = password.charAt(i); // more efficient to get char once

                if (Character.isDigit(ch)) {
                    digit = true;
                } else if (Character.isUpperCase(ch)) {
                    upperCase = true;
                } else if (Character.isLowerCase(ch)) {
                    lowerCase = true;
                }

            }

            if (upperCase && lowerCase && digit) {
                System.out.println("You successfully generated a password!");
            } else {
                System.out.println("Your password should include 1 uppercase, 1 lowercase, and 1 digit.");
                return false;
            }

            return true;

        } else {
            System.out.println("Password should be at least 8 characters.");
            return false;
        }

    }

    public static void main(String[] args) {

        Scanner askUser = new Scanner(System.in); //One Scanner Object
        GeneratePassword checker = new GeneratePassword();

        while (true) { // cleaner loop

            System.out.println("Create your password: ");
            String password = askUser.nextLine();

            if (password.isEmpty()) {
                System.out.println("Your password is not accepted");
            } else {
                if (checker.checkPassword(password)) {

                    break;

                }

            }

        }

    }


}
