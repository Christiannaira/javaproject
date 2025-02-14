import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

       // Palindrome
        Scanner askUser = new Scanner(System.in);

        System.out.println("Enter a number: ");

        String num = askUser.nextLine();

        boolean palindrome = isPalindrome(num);

        if (palindrome) {
            System.out.println(num + " is a Palindrome");
        } else {
            System.out.println(num + " is not a Palindrome");
        }

    }

    public static boolean isPalindrome(String num) {

        String originalNumber = num;
        String reversedNumber = "";

        for (int i = num.length() - 1; i >= 0; i--) {
            reversedNumber += num.charAt(i);
        }

        if (originalNumber.equals(reversedNumber)) {
            return true;
        } else {
            return false;
        }



    }

}

