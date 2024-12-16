import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

      Scanner askuser = new Scanner(System.in);

      int i = 0;
      while (i < 5) {

          System.out.println("Enter username: ");
          String username = askuser.nextLine();

          if (username.equals("Christian")) {

              int j = 1;
              while (j == 1) {

                  Scanner askUserNumber = new Scanner(System.in);
                  System.out.println("Enter your choice number (1, 2, 3, 4(exit)): ");
                  int userNumber = askUserNumber.nextInt();

                  if (userNumber == 1) {

                      System.out.println("1");

                  } else if (userNumber == 2) {

                      System.out.println("2");

                  } else if (userNumber == 3) {

                      System.out.println("3");

                  } else if (userNumber == 4) {

                      System.out.println("logging out...");
                      j = 0;


                  }



              }

          }

          i++;


      }

    }

}