package Vit.Assignement;

abstract class Employee{
    abstract void calculateSalary();
}
class PartTimeEmployee extends Employee{
    int salary;
    String name;
    PartTimeEmployee(String name, int salary){
        this.name = name;
        this.salary = salary;
    }
    void calculateSalary(){
        // No bonus for PartTimeEmployee
        System.out.println("Your salary is " + salary);
    }
}
class FullTimeEmployee extends Employee{
    int salary;
    String name;
    FullTimeEmployee(String name, int salary){
        this.name = name;
        this.salary = salary;
    }
    void calculateSalary(){
        int bonus=1500;
        // bonus for FullTimeEmployee
        this.salary += bonus;
        System.out.println("Your salary is " + salary);
    }
}

public class PayrollSystem {
    public static void main(String[] args) {
        FullTimeEmployee emp1 = new FullTimeEmployee("Suman",30000);
        PartTimeEmployee emp2 = new PartTimeEmployee("Kartik",20000);
        emp1.calculateSalary();
        emp2.calculateSalary(); 
    }
}
