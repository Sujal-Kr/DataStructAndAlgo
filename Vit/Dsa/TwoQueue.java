package Vit.Dsa;

public class TwoQueue {
    int size;
    int[] arr;
    int front1;
    int front2;
    int rear1;
    int rear2;
    TwoQueue(int size){
        this.size = size;
        this.arr=new int[2*size];
        front1=-1;
        rear1=-1;
        front2=arr.length;
        rear2=arr.length;
    }
    public void  add(int queue,int data){
        switch(queue){
            case 1:if(rear1==-1){
                        front1=rear1=0;
                        arr[rear1]=data;
                        rear1++;
                    }else{
                        if(rear1==size){
                            System.out.println("Overflow");
                            return;
                        }
                        arr[rear1]=data;
                        rear1++;
                    }
                    break;
            case 2:if(rear2==arr.length){
                        front2=rear2=arr.length-1;
                        arr[rear2]=data;
                        rear2--;
                    }else{
                        if(rear2==size-1){
                            System.out.println("overflow");
                            return;
                        }else{
                            arr[rear2]=data;
                            rear2--;
                        }
                    }
                    break;
            default :System.out.println("Invalid queue");
                    break;
        }
    }
    public boolean isFull(int queue){
        boolean full=false;
        switch(queue){
            case 1:if(rear1==size){
                        full=true;
                    }
                    break;
            case 2:if(rear2 ==size-1){
                        full=true;
                    }
                    break;
            default :System.out.println("Invalid queue");
                    break;
        }
        return full;
    }
    public int delete(int queue) {
        int deletedItem = -1;
        switch (queue) {
            case 1:
                if (front1 ==-1 || front1==rear1) {
                    System.out.println("Underflow in Queue 1");
                } else {
                    deletedItem = arr[front1];
                    front1++;
                }
                break;
            case 2:
                if (front2==arr.length||front2==rear2) {
                    System.out.println("Underflow in Queue 2");
                } else {
                    deletedItem = arr[front2];
                    front2--;
                }
                break;
            default:
                System.out.println("Invalid queue");
        }
        return deletedItem;
    }

    public void printAll(){
        for(int item:arr){
            System.out.print(item+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        TwoQueue q=new TwoQueue(4);
        q.add(1,1);
        q.add(1,2);
        q.add(1,3);
        q.add(1,4);

        q.add(2,5);
        q.add(2,4);
        q.add(2,3);
        q.add(2,2);
        
        System.out.println(q.isFull(2));
        
        q.printAll();
    }
}

