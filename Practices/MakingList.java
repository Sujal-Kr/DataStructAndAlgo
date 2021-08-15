package Practices;

public class MakingList {
  Node head;
  static class Node{
    int data;
    Node next;
    public Node(int value) {
      data = value;
      next = null;
    }
  }

  void add(int data) {
    Node toadd = new Node(data);
    if(head == null) {
      head=toadd;
      return;
    }
    else {
    Node temp = head;
    while(temp.next!=null) {
      temp = temp.next;
    }
    temp.next = toadd;
    return;
    }
  }
  
  void print() {
    Node temp = head;
    System.out.print("[ ");
    while(temp!= null) {
      System.out.print(temp.data + " ");
      temp = temp.next;
    }
    System.out.println("]");
  }                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            
  
  void delete(int value){
    Node temp = head;
    Node previous =head;
    if(temp.data==value) {
      head=temp.next;
    }
    while(temp.next != null) {
      if(temp.data == value) {
        previous.next = temp.next;
        break;
      }
      previous = temp;
      temp = temp.next;
    }
    if(temp.next==null) {
      previous.next = null;
    }


}
  
  void sizeof() {
    Node temp = head;
    int size=0;
    while(temp != null) {
      temp = temp.next;
      size++;
    }
    System.out.println(size);
  }
  
  void insert(int Index, int value) {
    Node toinsert = new Node(value);
    Node temp = head;
    Node previous = head;
    int i=0;
    if(Index==0) {
      Node num = head;
      head = toinsert;
      toinsert.next = num;
    }else {
    while(temp!=null) {
      if(Index==i) {
        previous.next = toinsert;
        toinsert.next = temp;
        break;
      }
      i++;
      previous = temp;
      temp = temp.next;
        }
    }
  }
  
  void addAll(MakingList X) {
    Node temp = head;
    while(temp.next!=null) {
      temp = temp.next;
    }
    temp.next = X.head;
  }
  
  void Erase() {
    head=null;
  }
  
  void deleteAll(MakingList X) {
    Node temp=X.head;
    while(temp!=null){
      delete(temp.data);
      temp=temp.next;
    }
  }
  
  public static void main(String[] args) {

     MakingList ml = new MakingList();
     ml.add(62);
     ml.add(0);
     ml.add(78);
//     for(int i=0;i<7;i++) {
//       ml.add(i);
//     }
//     ml.add(67);
//     ml.add(88);
//     ml.delete(62);
//     for(int i=0;i<6;i++) {
//       ml.delete(i);
//     }
//     ml.delete(62);
//     ml.delete(0);
     
     ml.print();
     ml.insert(2, 2145);
     ml.insert(0, 22);
     ml.sizeof();
//     ml.delete(78);
     ml.print();
//     ml.sizeof();
     MakingList lm = new MakingList();
     lm.add(11);
     lm.add(123);
     lm.print();
     lm.addAll(ml);
     lm.print();
     MakingList toremove = new MakingList();{
       toremove.add(2145);
       toremove.add(0);
       toremove.add(11);
     }
     lm.deleteAll(toremove);
     lm.print();
  }

}