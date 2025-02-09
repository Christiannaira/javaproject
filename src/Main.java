
import java.io.File;
import java.io.IOException;

public class Main {

    // File Handling

    public static void main(String[] args) {

        try {
            File myObj = new File("filename5.txt");
            if (myObj.createNewFile()) {

                System.out.println("File created: " + myObj.getName());

            } else {

                System.out.println("File already exists.");

            }

        } catch (IOException e) {

            System.out.println("An error occured.");

            e.printStackTrace(); // Detailed stack trace

        }

        // Execution continue even after the exception


    }

}

