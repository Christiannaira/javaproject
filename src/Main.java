
import java.lang.Character;
import java.lang.String;

class Main {


    public static void main(String[] args) {

        String firstName = "Christian";

        for (int i = 0; i < firstName.length(); i++) {

            if (Character.isLetter(firstName.charAt(i))) {

                System.out.println(firstName.charAt(i) + " is Letter");

            } else if (Character.isDigit(firstName.charAt(i))) {

                System.out.println(firstName.charAt(i) + " is Digit");

            } else if (Character.isLetterOrDigit(firstName.charAt(i))) {

                System.out.println(firstName.charAt(i) + " is both Letter and Digit");

            }

        }


    }

}

