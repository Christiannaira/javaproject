import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<Integer>();
        list.ensureCapacity(15);

        for (int i = 1; i<= 15; i++) {
            list.add(i);
        }

        System.out.println(list);



    }

}