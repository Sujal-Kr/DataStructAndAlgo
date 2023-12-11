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
            default:break;
                    
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
            default:break;
        }
        return poppedEle;
    }
    boolean isFull(int stackOrder){
        boolean full=false;
        switch(stackOrder){
            case 1: if(first==size-1){
                        full=true;
                    }
                    break;
            case 2: if(second==2*size-1){
                        full=true;
                    }
                
                    break;
            case 3: if(third==arr.length-1){
                        full=true;
                    }
                    break;
            default:break;
        }
        return full;
    }
    boolean isEmpty(int stackOrder){
        boolean isEmpty=false;
        switch(stackOrder) {
            case 1: if(first==-1){
                        isEmpty=true;
                    }
            
                    break;
            case 2: if(second==size-1){
                        isEmpty=true;
                    }
                    break;
            case 3: if(third==2*size-1){
                        isEmpty=true;
                    }
                    break;
            default:break;
        }
        return isEmpty;
    }
    void printAll(){
        for(int item:arr){
            System.out.print(item+" ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        MultiStack stack=new MultiStack(3);
        // stack.push(0, 0);
        stack.push(1, 34);
        stack.push(2, 45);
        stack.push(3, 67);
        stack.push(1,56);
        stack.push(1,90);
        stack.push(1,110);
        System.out.println(stack.pop(3));
        System.out.println(stack.isEmpty(3));
        
    }
}
