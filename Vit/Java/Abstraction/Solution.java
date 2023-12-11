package Vit.Java.Abstraction;

abstract class PayementMethod{
    int accountNumber;
    int balance;
    abstract void processPayment();
}
class CreditCard extends PayementMethod{
    void processPayment(){
        System.out.println("Payment done through CreditCard");
    }
}
class PayPal extends PayementMethod{

    void processPayment(){
        System.out.println("Payment done through PayPal");
    }
}


public class Solution {
    public static void main(String[] args) {
        
        new PayPal().processPayment();
        new CreditCard().processPayment();
    }
}
