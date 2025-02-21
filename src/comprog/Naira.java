package comprog;

public class Naira {

    public void getFactOne() {
        System.out.println("I am 5'3 feet in height");
    }

    public void getFactTwo() {
        System.out.println("I love playing guitar instrument");
    }

    public void getFactThree() {
        System.out.println("I love writing and reading simple and great stories");
    }

}

class Christian extends Naira {

    @Override
    public void getFactOne() {
        super.getFactOne();
    }

    @Override
    public void getFactTwo() {
        super.getFactTwo();
    }

    @Override
    public void getFactThree() {
        super.getFactThree();
    }
}

class Main {

    public static void main(String[] args) {

        Christian student = new Christian();
        student.getFactOne();
        student.getFactTwo();
        student.getFactThree();

    }

}