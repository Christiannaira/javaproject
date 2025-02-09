
import java.io.File; // get the File class from java.io package
import java.io.IOException;// get the IOException class from java.io package

public class Main {

    // File Handling

    public static void main(String[] args) {

        File newFile = new File("filename.txt"); // create an instance for File class

        // always use handling error to prevent file handling crashing
        try {

            if (newFile.createNewFile()){ // call the createNewFile method from newFile object to create a new file

                System.out.println("File created: " + newFile.getName()); // use the newFile object to call getName method.

            } else {

                System.out.println("File already exists");

            }

        } catch (IOException e) {

            System.err.println("an error occured");
            e.printStackTrace(); // it is used for debugging and troubleshooting

        }


    }

}

