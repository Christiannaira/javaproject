package employee;

// Make a class Employee with a name and salary. Make a class Manager inherit from Employee.
// Add an instance variable, named department, of type String.
// Supply a method toString that prints that manager's name, department, and salary.
// Make a class Executive inherit from Manager.
// Supply appropriate toString methods for all classes.
// Supply a test program that tests the classes and methods.

public class Employee {

    String name;
    double salary;

    public Employee(String name, double salary){

        this.name = name;
        this.salary = salary;

    }

    public String toString() {

        String employeeName = "Employee's Name: " + name;
        String employeeSalary = "Employee's Salary: " + salary;

        return employeeName + " \n" + employeeSalary;

    }

    // additional

    // setters
    public void setName(String name){

        this.name = name;

    }

    public void setSalary(double salary) {

        this.salary = salary;

    }

    //getters
    public String getName() {

        return name;

    }

    public double getSalary(){

        return salary;

    }

    public static void main(String[] args) {

        Employee employee01 = new Employee("Pierre Lawrence", 15000);
        Manager manager01 = new Manager("Dominic Jao", 20000, "Sales and Marketing");
        Executive executive01 = new Executive("Christian Naira", 60000, "Operation");

        System.out.println(employee01);
        System.out.println("====================================");
        System.out.println(manager01);
        System.out.println("====================================");
        System.out.println(executive01);
        System.out.println("====================================\n");

        executive01.setName("Bryan Bes");
        executive01.setSalary(200000);
        executive01.setDepartment("Creatives");


    }


}

class Manager extends Employee{

    String department;

    public Manager(String name, double salary, String department){
        super(name, salary);
        this.department = department;
    }

    public String toString(){

        String managerName = "Manager's Name: " + name;
        String managerDepartment = "Manager's Department: " + department;
        String managerSalary = "Manager's Salary: " + salary;

        return managerName + " \n" + managerDepartment + " \n" + managerSalary;
    }

    // additional

    // setters
    public void setDepartment(String department) {

        this.department = department;

    }

    // getters
    public String getDepartment() {

        return department;

    }


}

class Executive extends Manager {

    public Executive(String name, double salary, String department){
        super(name, salary, department);
    }

    public String toString(){

        String executiveName = "Executive's Name: " + name;
        String executiveDepartment = "Executive's Department: " + department;
        String executiveSalary = "Executive's Salary: " + salary;

        return executiveName + " \n" + executiveDepartment + " \n" + executiveSalary;

    }

}
