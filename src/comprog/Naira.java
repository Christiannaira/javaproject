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

// version 01 - inherit Naira methods
class Christian extends Naira {

    @Override // version 02 - overriding methods
    public void getFactOne() {
        super.getFactOne(); // version 03 - using super keyword to call the overridden method from the superclass
        System.out.println("-> I am 5'5 feet in height");
    }

    @Override // version 02 - overriding methods
    public void getFactTwo() {
        super.getFactTwo(); // version 03 - using super keyword to call the overridden method from the superclass
        System.out.println(" ->I love playing guitar instrument and singing");
    }

    @Override // version 02 - overriding methods
    public void getFactThree() {
        super.getFactThree(); // version 03 - using super keyword to call the overridden method from the superclass
        System.out.println("-> I love writing, reading and making simple and great stories");
    }
}


class Main {

    public static void main(String[] args) {

        Christian student = new Christian(); // create an object of a Christian

        // calls methods from the Christian class
        student.getFactOne();
        student.getFactTwo();
        student.getFactThree();

    }

}