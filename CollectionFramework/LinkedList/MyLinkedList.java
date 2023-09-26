package CollectionFramework.LinkedList;
public class MyLinkedList {
    public node head;
    public void add(int data){
        node x=new node(data);
        node temp=head;
        if(head==null){
            head=x;
            return;
        }
        while(temp.next!=null){
            temp=temp.next;
        } 
        temp.next=x;
    }
    public void popping(){
        node temp=head;
        if(temp==null){
            //System.out.println("underflow");
            return;
        }
        else if(temp.next==null){
            head=null;
        }
        else{
            while(temp.next.next!=null){
                temp=temp.next;
            }
            temp.next=null;
            //System.out.println("popped out");
        }
    }
    public void print(){
        node temp=head;
        if(head==null){
            return;
        }
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    int getdata(int index) {
        node temp=head;
        for(int i=0; i<=index; i++){
            if(i==index){ 
                return temp.data;
            }
            temp=temp.next;
        }
        return 0;
    }
    void removeAll(){
        this.head=null;
    }
    public int lastIndex(){
        node temp=head;
        if(temp==null){
            System.out.println("underflow");
            return 0;
        }
        else{
            while(temp.next!=null){
                temp=temp.next;
            }
            return temp.data;
        }
    }
    void specific(int index,int data){
        node temp=head;
        node x=new node(data);
        if(index==0){
            x.next=head;
            head=x;
            return;
        }
        else{
            int i=1;
            while(i<index){
                i++;
                temp=temp.next;
            }
            x.next=temp.next;
            temp.next=x;
        }
    }
    void delete(int index){
        node temp=this.head; 
        if(index==0){
            this.head=temp.next;
        }
        else{
            int i=1;
            while(i<index){
                i++;
                temp=temp.next;
            }
            node newetemp=temp.next;
            temp.next=newetemp.next;
        }
    }
    int size(){
        int count=0;
        node temp=head;
        while(temp.next!=null){
            temp=temp.next;
            count++;
        }
        count++;
        return count;
    }
    void search(int value){
        node temp=head;
        boolean found=false;
        if(temp==null){
            System.out.println("underflow");
            return;
        }
        else{
            int index=0;
            while(temp!=null){
                if(temp.data==value){
                    System.out.println("Index:" + index);
                    found=true;
                }
                index++;
                temp=temp.next;
            }
        }
        if(!found){
            System.out.println("No such element exist.");
        }
    }
    void NewAdd(MyLinkedList obj){
        node temp=this.head;
        if(temp==null){
            System.out.println("Not possible");
            return;
        }
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=obj.head;
    }
    
	
    int[] ToArray(){
        node temp=head;
        int[] array=new int[this.size()];
        int i=0;
        while(temp!=null){
            array[i++]=temp.data;
            temp=temp.next;
        }
        return array;
    }
    void delvalue(int value){
        node temp=head;
        node newtemp;
        if(temp.data==value){
            head=head.next;
            return;
        }
        else if(temp.data!=value){
            while(temp.next!=null){
                if(temp.next.data==value){
                    break;
                }
                temp=temp.next;
            }
            newtemp=temp.next;
            temp.next=newtemp.next;
        }
        else{
            while(temp.next.next!=null){
                temp=temp.next;
                break;
            }
            temp.next=null;
        }
    }
    void Reverse(){
        node current=head;
        node prev=null;
        node after;
        while(current!=null){
            after=current.next;
            current.next=prev;
            prev=current;
            current=after;
        }
        head=prev;
    }
    
	
    void erase(MyLinkedList x){
        node temp=x.head;
        if(temp==null){
            return;
        }
        while(temp!=null){
            this.delvalue(temp.data);
            temp=temp.next;
        }
    }
    public static class node{
        public int data;
        public node next;
        public node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static void main(String[] args){
        MyLinkedList roll=new MyLinkedList();
        // MyLinkedList Admis=new MyLinkedList();
        // MyLinkedList clean=new MyLinkedList();
        MyLinkedList  x=new MyLinkedList();
        MyLinkedList  y=new MyLinkedList();
        // clean.add(20);
        // clean.add(30);
        // clean.add(40);
        // roll.add(6);
        // roll.add(20);
        // roll.add(11);
        // roll.add(40);
        // roll.add(7);
        // Admis.add(1);
        // Admis.add(5);
        // Admis.add(9);
        // Admis.add(4);
        // roll.print();
        // //roll.sort();
        // //roll.NewAdd(Admis);
        roll.Reverse();
        // roll.print();
        // roll.Reverse();
        
        // int[] x=roll.ToArray();
        // for(int i=0; i<x.length; i++){
        //     System.out.print(x[i]+" ");
        // }
        // System.out.println();
        y.add(7);
        y.add(5);
        
        x.add(0);
        
        x.sum(y);
        
        

    }
    public void sum(MyLinkedList y) {
        int size1=this.size();
        int size2=y.size();
        node temp1=this.head;
        node temp2=y.head;

        if(size1>=size2){
            int sum=0;
            int r=0;
            while(temp1!=null){
                
                if(temp2!=null){
                    sum=temp2.data+temp1.data+r;
                    if(sum>=10){
                        temp1.data=sum%10;
                        r=1;
                    }
                    else{
                        temp1.data=sum;
                        r=0;
                    }
                    temp2=temp2.next;
                }
                else{
                    sum=temp1.data+r;
                    if(sum>=10){
                        temp1.data=sum%10;
                        r=1;
                    }
                    else{
                        temp1.data=sum;
                        r=0;
                    }
                }
                temp1=temp1.next;
            }
            if(r!=0){
                temp1=this.head;
                node x=new node(r);
                while(temp1.next!=null){
                    temp1=temp1.next;
                }
                temp1.next=x;
            }
            this.print();
        }
        else{
            int sum=0;
            int r=0;
            while(temp2!=null){
                
                if(temp1!=null){
                    sum=temp2.data+temp1.data+r;
                    if(sum>=10){
                        temp2.data=sum%10;
                        r=1;
                    }
                    else{
                        temp2.data=sum;
                        r=0;
                    }
                    temp1=temp1.next;
                }
                else{
                    sum=temp2.data+r;
                    if(sum>=10){
                        temp2.data=sum%10;
                        r=1;
                    }
                    else{
                        temp2.data=sum;
                        r=0;
                    }
                }
                temp2=temp2.next;
            }
            if(r!=0){
                temp2=y.head;
                node x=new node(r);
                while(temp2.next!=null){
                    temp2=temp2.next;
                }
                temp2.next=x;
            }
            y.print();
        }
    }
}
     
