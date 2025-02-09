
import java.io.File;
import java.io.IOException;

public class Main {

    // File Handling

    public static void main(String[] args) {

        try {
            File myObj = new File("C:\\Users\\USER\\IdeaProjects\\javaproject\\filename4.txt");
            if (myObj.createNewFile()) {

                System.out.println("File created: " + myObj.getName());
                System.out.println("Absolute path: " + myObj.getAbsolutePath());
                System.out.println("Absolute path: " + myObj.getAbsolutePath());

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

