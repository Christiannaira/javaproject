import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        //familiarizing myself with Java Lists
        //ArrayList can be modified without creating a new one or copy

        ArrayList<Integer> list = new ArrayList<Integer>();
        list.ensureCapacity(15);

        for (int i = 1; i <= 15; i++) {
            list.add(i);
        }

        System.out.println(list);


    }



}