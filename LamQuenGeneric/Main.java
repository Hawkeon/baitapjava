package BaiTapVeNha.LamQuenGeneric;

import java.util.ArrayList;

class Block<T>
{
    ArrayList<T> arr = new ArrayList<>();

    public void add(T value) {
        arr.add(value);
    }

    public T takeOut() {
        if (arr.isEmpty()) return null;
        return arr.remove(arr.size() - 1);
    }

    public void remove(T value) {
        arr.remove(value);
    }

    public ArrayList<T> getAll() {
        return new ArrayList<>(arr);
    }

    public void display() {
        for (T item : arr) {
            System.out.println(item);
        }
    }
}

class Book {
    String title, author;
    int publishYear;

    Book(String title, String author, int publishYear) {
        this.title = title;
        this.author = author;
        this.publishYear = publishYear;
    }

    public String toString() {
        return "Book{" + title + ", " + author + ", year=" + publishYear + "}";
    }
}

class Phone {
    String brand, model;
    int price;

    Phone(String brand, String model, int price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public String toString() {
        return "Phone{" + brand + " " + model + ", price=" + price + "}";
    }
}

class Food {
    String name;
    String expiryDate; 

    Food(String name, String expiryDate) {
        this.name = name;
        this.expiryDate = expiryDate;
    }

    public String toString() {
        return "Food{" + name + ", expiry=" + expiryDate + "}";
    }
}

public class Main {

    public static void main(String[] args) {

        // Block for Books
        Block<Book> bookBlock = new Block<>();
        bookBlock.add(new Book("Clean Code", "Robert C. Martin", 2008));
        bookBlock.add(new Book("Effective Java", "Joshua Bloch", 2018));

        // Block for Phones
        Block<Phone> phoneBlock = new Block<>();
        phoneBlock.add(new Phone("Apple", "iPhone 15", 25000000));
        phoneBlock.add(new Phone("Samsung", "Galaxy S24", 22000000));

        
        Block<Food> foodBlock = new Block<>();
        foodBlock.add(new Food("Milk", "10/12/2025"));
        foodBlock.add(new Food("Bread", "07/11/2025"));

        System.out.println("=== Book Block ===");
        bookBlock.display();
        System.out.println("pop " + bookBlock.takeOut());
        System.out.println("After pop");
        bookBlock.display();

        System.out.println("\n");
        phoneBlock.display();

        System.out.println("\n");
        foodBlock.display();
    }
}