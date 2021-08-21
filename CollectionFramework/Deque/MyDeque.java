package CollectionFramework.Deque;
public class MyDeque<E> {
    node<E> head,tail;
    void Athead(E data){
        node<E> x=new node<>(data);
        if(head==null){
            head=tail=x;
            return;
        }
        head.prev=x;
        x.next=head;
        head=x;
    }
    void AtTail(E data){
        node<E> x =new node<>(data);
        if(head==null){
            head=tail=x;
            return;
        }
        tail.next=x;
        x.prev=tail;
        tail=x;
    }
    E peekhead(){
        if(head==null){
            return null;
        }
        return head.data;
    } 
    E peektail(){
        if(head==null){
            return null;
        }
        return tail.data;
    }
    E RemoveHead(){
        if(head==null){
            return null;
        }
        node<E> temp=head;
        if(temp.next==null){
            head=null;
            tail=null;
            return temp.data;
        }
        head=head.next;
        head.prev=null;
        
        return temp.data;
    }
    E RemoveTail(){
        node <E> temp=head;
        if(head==null){
            return null;
        }
        if(head.next==null){
            head=tail=null;
            return temp.data;
        }
        while(temp.next.next!=null){
            temp=temp.next;
        }
        node<E> store=temp.next;
        temp.next=null;
        return store.data; 
    }
    void Print(){
        node<E> temp=this.head;
        if(temp==null){
            return;
        }
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    static class node<E>{
        E data;
        node<E> next;
        node<E> prev;
        node(E data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }  
    public static void main(String[] args) {
        MyDeque<Integer> DQ=new MyDeque<>();
        DQ.Athead(1);
        DQ.Athead(2);
        DQ.AtTail(5);
        DQ.AtTail(6);
        DQ.Print();
        // System.out.println(DQ.RemoveHead());
        // System.out.println(DQ.RemoveHead());
        // System.out.println(DQ.RemoveHead());
        // System.out.println(DQ.RemoveHead());
        // System.out.println(DQ.RemoveHead());
        // System.out.println(DQ.RemoveTail());
        // System.out.println(DQ.RemoveTail());
        // System.out.println(DQ.RemoveTail());
        // System.out.println(DQ.RemoveTail());
        // System.out.println(DQ.RemoveTail());
        System.out.println(DQ.peekhead());
        System.out.println(DQ.peektail());
    }
}
