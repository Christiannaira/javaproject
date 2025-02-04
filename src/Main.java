

class Main {

    public static void main(String[] args) {

        NewClass anotherClass = new NewClass("turned off");
        System.out.println(anotherClass.getResult());
        anotherClass.setResult("new description");

        System.out.println(anotherClass.getResult());

    }

}
