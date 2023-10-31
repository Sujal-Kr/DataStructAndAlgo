package Vit.Assignement;
public class Product {
    
    private int productId;
    private String productName;
    private double price;

    
    public Product(int productId, String productName, double price) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
    }

    
    public int getProductId() {
        return productId;
    }

    
    protected void printDetails() {
        System.out.println("Product Name: " + productName);
        System.out.println("Price: " + price);
    }

    
    private boolean isExpensive() {
        return price > 100.0;
    }

    public static void main(String[] args) {
      
        Product product1 = new Product(1, "Apple", 300.99);
        
        product1.printDetails();
        
        if(product1.isExpensive()) {
            System.out.println("Is Expensive");
        }else{
            System.out.println("Not Expensive");
        }

    }
}


