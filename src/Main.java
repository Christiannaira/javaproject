
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    // File Handling

    public static void main(String[] args) {

        File myObj = new File("filename.txt");

        if (myObj.delete()) {
            System.out.println("Deleted the file: " + myObj.getName());
        } else {
            System.out.println("Failed to delete the file");
        }


    }

}

