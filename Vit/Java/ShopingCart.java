package Vit.Java;
import java.util.*;
class product{
    String name;
    String cat;
    int price;
    public product(String name,int price,String cat) {
        this.name = name;
        this.price = price;
        this.cat = cat;
    }

}
class AllProduct{
    
    Map<String ,LinkedList<product>> map;
    AllProduct(){
        map=new HashMap<>();
        
    }
    public void addProduct(String name,int price,String cat){
        map.putIfAbsent(cat,new LinkedList<>());
        map.get(cat).add(new product(name,price,cat));
    }
    public void getMenu(){
        addProduct("laptop", 3455, "xyz");
        addProduct("apple", 345, "fruit");
        addProduct("skirt", 355, "cloth");
        for(String item : map.keySet()){
            for(product p :map.get(item) ){
                System.out.println(p.name + " " + p.price);
            }
        }
    }
}
public class ShopingCart {
    List<product> cart=new ArrayList<>();
    
    ShopingCart(){
        System.out.println("Add items to cart");
    }

    public static void main(String[] args) {
        AllProduct all=new AllProduct();
        all.getMenu();
    }
}
