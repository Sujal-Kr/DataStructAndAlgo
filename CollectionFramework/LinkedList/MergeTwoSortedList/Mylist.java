package CollectionFramework.LinkedList.MergeTwoSortedList;

public class Mylist {
    node head;
    static class node{
        int data;
        node next;
        node(int data){
            this.data = data;
            this.next=null;
        }
        
    }
    void add(int data){
        node x=new node(data);
        if(head==null){
            head=x;
            return;
        }
        node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=x;
    }
    void print(){
        node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Mylist list1=new Mylist();
        Mylist list2=new Mylist();
        
        list1.add(2);
        list1.add(3);
        list1.add(8);
        
        list2.add(1);
        list2.add(6);
        list2.add(7);
        merge(list1,list2);
        
    }
    static void merge(Mylist list1, Mylist list2) {
        node temp1=list1.head;
        node temp2=list2.head;
        node z=new node(0);
        while(temp1!=null&&temp2!=null){
            if(temp1.data>temp2.data){
                z.next=temp1;
                
                temp1=temp1.next;
            }
            else{
                z.next=temp2;

                temp2=temp2.next;
            }
            z=z.next;
        }
        if(temp1!=null){
            z.next=temp1;
            temp1=temp1.next;
        }
        else{
            z.next=temp2;
            temp2=temp2.next;
        }
        node temp=z.next;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
}
