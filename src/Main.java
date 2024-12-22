import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        HashMap<String, String> capitalCities = new HashMap<String, String>();
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");

        capitalCities.merge("Canada", "Ottawa", (a, b) -> a + " -> " + b);
        capitalCities.merge("England", "London", (a, b) -> a + " -> " + b);
        capitalCities.merge("Germany", "Berlin", (a, b) -> a + " -> " + b);

        System.out.println(capitalCities);


    }

}