package Vit.Java.MultiThreading;
class printNum implements Runnable {
    int num = 0;
    printNum(int num){
        this.num = num;
    }
    public void run(){
        for (int i = 0; i < num; i++) {
            System.out.println(i);
        }
    }
}
class printChar implements Runnable {
    char item;
    int num;
    printChar(char item,int num){
        this.item = item;
        this.num = num;
    }
    public void run(){
        for(int i = 0; i < num; i++) {
            System.out.println(item);
        }
    }
}
public class ThreadEx  {
    public static void main(String[] args) {
        Thread t1=new Thread(new printChar('A', 10));
        Thread t2=new Thread(new printNum(100));
        t2.setPriority(Thread.MAX_PRIORITY);
        try{
            t1.start();
            t2.start();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    public void run(){
        for (int i = 0; i < 100; i++) {
            System.out.println("Thread "+i+" ");
        }
    }

}