import java.io.File;

public class Main {

    public static void main(String[] args) {

        File myObj = new File("filename2.txt");

        if (myObj.delete()) {
            System.out.println("Deleted the file: " + myObj.getName());
        } else {
            System.out.println("Failed to delete the file.");
        }

    }

}