package inheritance;

abstract class Animal {
    // Abstract method (does not have a body)
    public abstract void animalSound();
    // Regular method
    public void sleep() {
        System.out.println("Zzz");
    }

}

// Subclass (inherit from Animal)
class Pig extends Animal {
    // The body of animalSound() is provided here
    public void animalSound() {
        System.out.println("The pig says: wee wee");
    }

}


public class Main {

    public static void main(String[] args) {

        Pig myPig = new Pig(); // Create a Pig object
        myPig.animalSound();
        myPig.sleep();

    }

}
