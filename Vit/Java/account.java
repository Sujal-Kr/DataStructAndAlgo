package Vit.Java;

public class account {
    int accNo;
    String accName;
    int balance;
    account(int accNo, String accName){
        this.accName = accName;
        this.accNo = accNo;
        this.balance = 0;
    }


    public static void main(String[] args) {
        account x=new account(69, "Sujal");
        x.deposit(20000);
        x.withdraw(500);
        System.out.println(x.balance());
    }


    public  void deposit(int amount) {
        this.balance+=amount;
        System.out.println("Credited  amount "+amount+" successfully");
    }
    public int balance() {
        return this.balance;
    }
    public void withdraw(int amount) {
        if(amount<=balance){
            this.balance-=amount;
            System.out.println("withdrawn  amount "+amount+" successfully");
        }
        else{
            System.out.println("Insufficent balance");
        }
    }
}
