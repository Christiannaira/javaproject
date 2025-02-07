package person;

// Implement a superclass Person. Make two classes, Student and Instructor, that inherit
// from Person. A person has a name and a year of birth. A student has a major, and an instructor has a salary.
// Write the class declarations, the constructors, and the methods to toString for all classes.
// Supply a test program that tests these classes and methods.

// Superclass or Parent class
public class Person {

    protected String name;
    protected int birthYear;

    public Person(String name, int birthYear){

        this.name = name;
        this.birthYear = birthYear;

    }

    public String toString() {

        String personName = "Person's Name: " + name;
        String personBirthYear = "Person's BirthYear: " + birthYear;

        return personName + " \n" + personBirthYear;

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


        System.out.println(student01);
        System.out.println("\n============================\n");
        System.out.println(instructor01);


    }

}

class Student extends Person {

    private String major;

    public Student(String name, int birthYear, String major){
        super(name, birthYear);
        this.major = major;
    }

    public String toString(){

        String studentName = "Person's Name: " + name;
        String studentBirthYear = "Person's BirthYear: " + birthYear;
        String studentMajor = "Student's Major: " + major;

        return studentName + " \n" + studentBirthYear + " \n" + studentMajor;

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

    public String toString() {

        String instructorName = "Person's Name: " + name;
        String instructorBirthYear = "Person's BirthYear: " + birthYear;
        String instructorSalary = "Student's Salary: " + salary;

        return instructorName + " \n" + instructorBirthYear + " \n" + instructorSalary;

    }

    public void setSalary(double salary) {

        this.salary = salary;

    }

    public double getSalary() {

        return salary;

    }

}
