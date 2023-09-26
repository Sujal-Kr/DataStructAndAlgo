package Vit.Dsa;

public class MultiStack {
    int arr[];
    int first;
    int second;
    int third;
    int size;
    MultiStack(int size){
        arr=new int[size*3];
        System.out.println("3 stack Created of size " + size);
        first=-1;
        second=size-1;
        third=2*size-1;
        this.size=size;
    }
    void push(int stackOrder,int data){

        switch(stackOrder){
            case 1: if(first==size-1){
                        System.out.println("Overflow");
                    }
                    else{
                        first++;
                        arr[first]=data;
                    }
                    break;
            case 2: if(second==2*size-1){
                        System.out.println("Overflow");
                    }
                    else{
                        second++;
                        arr[second]=data;
                    }
                    break;
            case 3: if(third==arr.length-1){
                        System.out.println("Overflow");
                    }
                    else{
                        third++;
                        arr[third]=data;
                    }
                    break;
            default:throw new Error("Invalid stack order");
        }
    }
    int pop(int stackOrder){
        int poppedEle=-1;
        switch(stackOrder) {
            case 1: if(first==-1){
                        System.out.println("Underflow");
                    }else{
                        poppedEle=arr[first];
                        first--;
                    }
                    break;
            case 2: if(second==size-1){
                        System.out.println("Underflow");
                    }else{
                        poppedEle=arr[second];
                        second--;
                    }
                    break;
            case 3: if(third==2*size-1){
                        System.out.println("Underflow");
                    }else{
                        poppedEle=arr[third];
                        third--;
                    }
                    break;
            default:throw new Error("Invalid stack order");
        }
        return poppedEle;
    }
    void printAll(){
        for(int item:arr){
            System.out.print(item+" ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        MultiStack stack=new MultiStack(5);
        stack.push(0, 0);
        stack.push(1, 34);
        stack.push(2, 45);
        stack.push(3, 67);
        stack.push(3, 21);
        System.out.println(stack.pop(3));
        System.out.println(stack.pop(3));
    }
}
