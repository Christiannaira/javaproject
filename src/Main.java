

class Main {

    public static void main(String[] args) {

        NewClass anotherClass = new NewClass();

        System.out.println(anotherClass.printResult());

        System.out.println(newMethod());

    }

    public static String newMethod(){

        return "new method returned";

    }

}
