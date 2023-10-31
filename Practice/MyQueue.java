package Practice;

public class MyQueue {
    int[] arr;
    int front;
    int rear;
    MyQueue(int size){
        this.arr = new int[size];
        this.front = this.rear =-1;
    }
    void enqueue(int data){
        
        if(rear==arr.length-1){
            System.out.println("overflow");
            return;
        }else{
            if(rear==-1){
                front=rear=0;
            }
            else{
                rear++;
            }
            arr[rear]=data;
        }
    }
    int dequeue(){
        if(front==-1||front>rear){
            System.out.println("Underflow");
            return -1;
        }else{ 
            int temp=arr[front];
            front++;
            return temp;
        }
    }
    public static void main(String[] args) {
        
    }
}
