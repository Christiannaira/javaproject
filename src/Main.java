
public class Main {

    public static void main(String[] args) {


        try {
            String myStr = "Hello";
            char result = myStr.charAt(10);
            System.out.println(result);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("failed");
        }


    }

}