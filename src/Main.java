
public class Main {

    public static void main(String[] args) {

        String myStr = "I love cats. Cars are very easy to love. Cats are very popular.";
        String regex = "(?i)cat";
        System.out.println(myStr.replaceAll(regex, "dog"));

    }

}