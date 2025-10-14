package BaiTapVeNha.LamQuenKeThua.Bai2 ;
interface EmailSender {
    void sendEmail();
}


interface Programmer {
    void code();
}


interface Salesperson {
    void sell();
}


abstract class Employee {
    protected String name;
    protected int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age : " + age);
    }
}


class OfficeEmployee extends Employee implements EmailSender {
    public OfficeEmployee(String name, int age) {
        super(name, age);
    }

    @Override
    public void sendEmail() {
        System.out.println(name + "sent email");
    }
}


class TechnicalEmployee extends Employee implements EmailSender, Programmer {
    public TechnicalEmployee(String name, int age) {
        super(name, age);
    }

    @Override
    public void sendEmail() {
        System.out.println(name + " sent email");
    }

    @Override
    public void code() {
        System.out.println(name + "is coding");
    }
}


class SalesEmployee extends Employee implements EmailSender, Salesperson {
    public SalesEmployee(String name, int age) {
        super(name, age);
    }

    @Override
    public void sendEmail() {
        System.out.println(name + " sent email");
    }

    @Override
    public void sell() {
        System.out.println(name + "selling product");
    }
}


public class Main {
    public static void main(String[] args) {
        OfficeEmployee e1 = new OfficeEmployee("Do mimi", 30);
        TechnicalEmployee e2 = new TechnicalEmployee("Mo li chi", 28);
        SalesEmployee e3 = new SalesEmployee("Kim Ri Cha", 25);

        
        e1.displayInfo();
        e1.sendEmail();

        
        e2.displayInfo();
        e2.sendEmail();
        e2.code();

        
        e3.displayInfo();
        e3.sendEmail();
        e3.sell();
    }
}
