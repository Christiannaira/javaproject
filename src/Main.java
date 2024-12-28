import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Main {

    public static void main(String[] args) {

        //familiarizing myself with Java Lists
        //ArrayList can be modified without creating a new one or copy

        ArrayList<Integer> list = new ArrayList<Integer>();

        list.add(5);
        list.add(8);
        list.add(9);
        list.add(1);

        list.remove(Integer.valueOf(1));
        list.remove(1);

        System.out.println(list);

    }



}