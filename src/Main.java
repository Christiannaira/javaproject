
public class Main {

    public static void main(String[] args) {

        int[] numbers = new int[5];
        int[] numbers2 = {1, 2, 3, 4, 5};

        numbers[2] = 10;

        int arrayLength = numbers.length;

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }


    }

}