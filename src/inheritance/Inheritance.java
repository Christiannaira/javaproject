package inheritance;

class Vehicle {

    protected String brand = "Ford";
    public void honk() {

        System.out.println("Tuut, tuut");

    }

}

final class Inheritance extends Vehicle {

    private String modelName = "Mustang";

    public static void main(String[] args) {

        Inheritance myFastCar = new Inheritance();
        myFastCar.honk();
        System.out.println(myFastCar.brand + " " + myFastCar.modelName);

    }

}


