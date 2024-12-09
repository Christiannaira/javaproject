import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

//        int[] numbers = new int[5];
        int[] numbers = {5,6,1,2};

        int[] newArray = Arrays.copyOf(numbers, numbers.length);

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        System.out.println("\n");

        for (int i : newArray) {
            System.out.println(i);
        }

    }

}