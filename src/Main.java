import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] myNum = {50, 10, 25, 1, 17, 99, 13};

        Arrays.sort(myNum, 1, 4);

        for (int i: myNum) {
            System.out.println(i);
        }

    }

}