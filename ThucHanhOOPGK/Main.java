package BaiTapVeNha.ThucHanhOOPGK;


import java.util.ArrayList;
import java.util.List;



class Product { 
    private String name  ; 
    private double price ; 
    public Product (String name , double price ) { 
        this.name = name ; 
        this.price = price; 
    } 
    public double getPrice () {
        return this.price ; 
     }
}

class Customer { 
    private String name , email ; 
    public Customer (String name , String email) { 
        this.name = name ; 
        this.email = email ;
    } 
}

class Order { 
    public static int orderCount = 0 ; 
    private Customer cus ; 
    private List<Product> arrProd ; 
    public Order (Customer cus ) { 
        this.orderCount += 1 ;
        this.cus = cus ; 
        this.arrProd = new ArrayList<>() ; 
        

    } 
    public void addProduct(Product product) { 
        arrProd.add(product ) ;
    }
    public double caculateTotal () { 
        double sum = 0 ;
        for (Product i : this.arrProd) { 
            sum+= i.getPrice() ; 
         }
         return sum ; 
    }
}



public class Main {
    public static void main(String[] args) {
        Customer a = new Customer("abc", "a@gmail.com") ; 
        Product b = new Product("LaptopDell", 120.05) ;  
        Product c = new Product("LaptopHP", 130.65) ; 
        
        Order d = new Order(a ) ; 
        d.addProduct(c);
        d.addProduct(b);
        System.out.println(d.caculateTotal());
        
    }
}
