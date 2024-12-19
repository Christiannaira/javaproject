
public class Main {

    public static void main(String[] args) {

        String myStr = "Hello";

        try {

            if (myStr.contains("lsl")) {

                System.out.println(true);

            }

        } catch (NumberFormatException e) {

            System.out.println("failed");

        }






    }

}