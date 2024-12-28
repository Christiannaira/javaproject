import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        //familiarizing myself with Java Lists
        //ArrayList can be modified without creating a new one or copy

        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(5);
        numbers.add(9);
        numbers.add(8);
        numbers.add(1);

        numbers.forEach((n) -> {
            System.out.println(n);
        });


    }



}