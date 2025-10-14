package BaiTapVeNha.LamQuenKeThua.Bai1 ;
class Employee {
    protected String name;
    protected int age;
    protected double salary;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
    }
}


class OfficeEmployee extends Employee {
    private int workingDays;
    private static final double DAILY_SALARY = 100;

    public OfficeEmployee(String name, int age, int workingDays) {
        super(name, age);
        this.workingDays = workingDays;
        this.salary = workingDays * DAILY_SALARY;
    }
}


class TechnicalEmployee extends Employee {
    private int workingHours;
    private double hourlyWage;

    public TechnicalEmployee(String name, int age, int workingHours, double hourlyWage) {
        super(name, age);
        this.workingHours = workingHours;
        this.hourlyWage = hourlyWage;
        this.salary = workingHours * hourlyWage;
    }
}


public class Main {
    public static void main(String[] args) {
        OfficeEmployee e1 = new OfficeEmployee("Nguyen Tien Duy", 30, 20);
        TechnicalEmployee e2 = new TechnicalEmployee("Kha se ni", 28, 160, 5.5);

        
        e1.displayInfo();

        
        e2.displayInfo();
    }
}
