

public class Main {

    static void myStaticMethod() {
        System.out.println("static");
    }

    public void publicMethod() {
        System.out.println("public");
    }

    public static void main(String[] args) {

        myStaticMethod();

        Main myObj = new Main();
        myObj.publicMethod();

    }

}