import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<ArrayList<String>> userAccounts = new ArrayList<>();

        ArrayList<String> user1 = new ArrayList<>();
        user1.add("Christian Naira");
        user1.add("1234");
        user1.add("5000");

        ArrayList<String> user2 = new ArrayList<>();
        user2.add("John Doe");
        user2.add("4321");
        user2.add("10000");

        System.out.println(userAccounts);

        userAccounts.add(user1);
        userAccounts.add(user2);

        System.out.println(userAccounts);


    }

}