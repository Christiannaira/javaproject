import java.util.Scanner;

public class Main {

    public static void main(String[] args){

      String strA = "Learn Java";
      String strB = "Learn Java";
      String strC = "Learn Kolin";
      boolean result;

      result = strA.equals(strB);
      System.out.println(result);

      result = strA.equals(strC);
      System.out.println(result);

      result = strC.equals(strA);
      System.out.println(result);


    }

}