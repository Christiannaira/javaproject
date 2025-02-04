

abstract class Root {
    public String fname = "John";
    public int age = 24;
    public abstract void study();
}

class Student extends Root {

    public int grauduationYear = 2018;

    public void study(){

        System.out.println("Studying all day long");

    }

}

class Main {


    public static void main(String[] args) {

        Student myObj = new Student();

        System.out.println("Name: " + myObj.fname);
        System.out.println("Age: " + myObj.age);
        System.out.println("Graduation Year: " + myObj.grauduationYear);
        myObj.study();

    }

}

