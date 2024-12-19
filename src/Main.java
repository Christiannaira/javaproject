
public class Main {

    public static void main(String[] args) {

        String myStr = "Split a string by spaces, and also punctuation.";

        String regex = "[,\\.\\s]";

        String[] myArray = myStr.split(regex);
        for (String s: myArray) {
            System.out.println(s);
        }

    }

}