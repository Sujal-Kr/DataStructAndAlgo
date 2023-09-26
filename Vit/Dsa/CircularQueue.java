package Vit.Dsa;
public class CircularQueue {
    int front;
    int rear;
    int arr[];
    CircularQueue(int size){
        front=rear=-1;
        arr=new int[size];
    }
    void enque(int data){
        if((rear+1==arr.length&&front==0)||rear+1==front){
            throw new Error("Overflow");
        }
        else{
            if(front==-1)front++;
            rear++;
            rear%=arr.length;
            arr[rear]=data;
        }
    }
    int deque(){
        int poppedEle=-1;
        if(front==-1){
            throw new Error("Underflow");
        }else{
            poppedEle=arr[front]; 
            if(front==rear){
                front=rear=-1;
            }
            front++;
            front%=arr.length;
        }
        return poppedEle;
    }
    public static void main(String[] args) {
        CircularQueue cq=new CircularQueue(4);
        cq.enque(1);
        cq.enque(23);
        cq.enque(45);
        cq.enque(0);
        cq.deque();
        cq.enque(455);
        System.out.println(cq.deque());
    }
}
