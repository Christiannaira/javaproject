
class OuterClass {

    int x = 10;

    // can't access outside of the class
    private class InnerClass {
        int y = 5;
    }

}

public class Main {

    public static void main(String[] args) {

            OuterClass myOuter = new OuterClass();
            System.out.println(myOuter.x);

    }

}

