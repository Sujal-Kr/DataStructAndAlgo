package Vit.Java;

import java.util.ArrayList;

class User {
    public String name;
    private int userId;
    protected String email;
    User(String name, String email) {
        this.name=name;
        this.email=email;
    }
    
    void polymorphicMethod(){
        System.out.println("i am a user");
    }
    protected void setId(int id){
        this.userId = id;
    }
    int getId(){
        return this.userId;
    }
}

class product{
    String pName;
    int price;
    product(String pName, int price){
        this.pName=pName;
        this.price=price;
    }
    product(String pName){
        this.pName=pName;
    }
}

class Buyer extends User {
    ArrayList<product> cart=new ArrayList<>();
    Buyer(String name, String email) {
        super(name,email);
    }
    
    void buyProducts(String name) {
        product s=new product(name);
        cart.add(s);
        System.out.println("Purchased");
    }

    void polymorphicMethod(){
        System.out.println("i am a buyer");
    }
    
}

class Seller extends User {
    ArrayList<product> product_sold=new ArrayList<>();
    Seller(String name, String email) {
        super(name, email);
    }
    
    void sellProducts(String name,int price) {
        product item=new product(name,price);
        product_sold.add(item);
        System.out.println("sold");
    }
    void polymorphicMethod(){
        System.out.println("i am a seller");
    }
}
class PremiumUser extends Buyer {
    final boolean freeDelivery=true;
    PremiumUser(String name, String email) {
        super(name, email);
    }

}

public class Ecommerce {
    public static void main(String[] args) {
        User user = new User("suman","simon@gmail.com");
        user.polymorphicMethod();

        Seller seller = new Seller("Raju","sellerOp@hotmail.com");
        seller.polymorphicMethod();
        
        Buyer buyer = new Buyer("Sujal","xyz@gmail.com");
        buyer.polymorphicMethod();
        
    }
}
