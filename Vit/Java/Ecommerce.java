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
    User(){

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
        super(name, email);
    }
    
    void buyProducts(String name) {
        product s=new product(name);
        cart.add(s);
        System.out.println("Purchased");
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
}
class PremiumUser extends Buyer {
    final boolean freeDelivery=true;
    PremiumUser(String name, String email) {
        super(name, email);
    }

}

public class Ecommerce {
    public static void main(String[] args) {
        Seller seller = new Seller("Raju","sellerOp@hotmail.com");
        seller.sellProducts("Football",200);
        Buyer buyer = new Buyer("Sujal","xyz@gmail.com");
        buyer.buyProducts("I Phone");
        for(product item: buyer.cart){
            System.out.print(item.pName);
        }
    }
}
