package Vit.Dsa;

public class Product {
    static class Node{
        int id ;
        String name;
        int price;
        Node next;
        Node(int id, String name, int price){
            this.id=id;
            this.name=name;
            this.price=price;
            this.next=null;
        }
    }
    public static void  print(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.id+" "+temp.name+" "+temp.price);
            temp=temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Node product=new Node(1,"apple",34);
        product.next=new Node(2,"orange", 35);
        product.next.next=new Node(3,"smart tv",1200);
        print(product);
    }
    
}
