package person;

// Superclass or Parent class
public class Person {

    protected String name;
    protected int birthYear;

    public Person(String name, int birthYear){

        this.name = name;
        this.birthYear = birthYear;

    }

    public void setName(String name) {

        this.name = name;

    }

    public void setBirthYear(int birthYear) {

        this.birthYear = birthYear;

    }

    public String getName(){

        return name;

    }

    public int getBirthYear(){

        return birthYear;

    }

    public static void main(String[] args) {

        Student student01 = new Student("Albert Martnez", 1988, "BSIT");
        Instructor instructor01 = new Instructor("Sir Domz", 1799, 30000);

        System.out.println("================================================");
        System.out.println("Student Name: " + student01.getName());
        System.out.println("Student BirthYear: " + student01.getBirthYear());
        System.out.println("Student Major: " + student01.getMajor());
        System.out.println("================================================");
        System.out.println("Instructor Name: " + instructor01.getName());
        System.out.println("Instructor BirthYear: " + instructor01.getBirthYear());
        System.out.println("Instructor Major: " + instructor01.getSalary());

        student01.setName("Christian Naira");
        student01.setBirthYear(2003);
        student01.setMajor("BSIT");

        instructor01.setName("Harly Napay");
        instructor01.setBirthYear(1973);
        instructor01.setSalary(20000);

        System.out.println("================================================");
        System.out.println("Student Name: " + student01.getName());
        System.out.println("Student BirthYear: " + student01.getBirthYear());
        System.out.println("Student Major: " + student01.getMajor());
        System.out.println("================================================");
        System.out.println("Instructor Name: " + instructor01.getName());
        System.out.println("Instructor BirthYear: " + instructor01.getBirthYear());
        System.out.println("Instructor Major: " + instructor01.getSalary());


    }

}

class Student extends Person {

    private String major;

    public Student(String name, int birthYear, String major){
        super(name, birthYear);
        this.major = major;
    }

    public void setMajor(String major){

        this.major = major;

    }

    public String getMajor() {

        return major;

    }

}

class Instructor extends Person {

    private double salary;

    public Instructor(String name, int birthYear, double salary){
        super(name, birthYear);
        this.salary = salary;
    }

    public void setSalary(double salary) {

        this.salary = salary;

    }

    public double getSalary() {

        return salary;

    }

}
