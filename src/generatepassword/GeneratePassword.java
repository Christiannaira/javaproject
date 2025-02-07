package generatepassword;

import java.util.Scanner;
import java.lang.Character;
import java.lang.String;

public class GeneratePassword {

    public void checkPassword(String userPassword) {


        for (int i = 0; i < userPassword.length(); i++) {

            if (Character.isDigit(userPassword.charAt(i))) {

                System.out.print(userPassword.charAt(i) + " " + true);

            } else {

                System.out.print(userPassword.charAt(i) + " ");

            }

        }



    }

    public static void main(String[] args) {

        Scanner askUser = new Scanner(System.in); // initialization of scanner

        System.out.print("Enter your Preferred Password: "); // prompt the user to enter his preferred password
        String userPassword = askUser.nextLine(); // store the user input value in this variable

        GeneratePassword genPass = new GeneratePassword(); // create an instance of the GeneratePassword class

        genPass.checkPassword(userPassword);

    }

}
