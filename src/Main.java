
import java.lang.Character;

class Main {


    public static void main(String[] args) {

        char letter = 'a';
        char num = '1';

        System.out.println(Character.isDigit(num));
        System.out.println(Character.isLetter(letter));
        System.out.println(Character.isDigit(letter));
        System.out.println(Character.isLetter(num));


    }

}

