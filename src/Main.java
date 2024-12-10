import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<ArrayList<Integer>> multiDimList = new ArrayList<>();

        ArrayList<Integer> row1 = new ArrayList<>();
        row1.add(1);
        row1.add(2);
        row1.add(3);

        ArrayList<Integer> row2 = new ArrayList<>();
        row2.add(4);
        row2.add(5);
        row2.add(6);

        multiDimList.add(row1);
        multiDimList.add(row2);

        System.out.println(multiDimList);
        System.out.println(multiDimList.get(0).get(1));

    }

}