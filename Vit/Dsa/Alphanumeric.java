package Vit.Dsa;

public class Alphanumeric {
    Node head;
    static class Node{
        char data;
        Node next;
        Node(char data){
            this.data =data;
            this.next = null;
        }
    }
    void push(char data){
        Node temp=head;
        Node x=new Node(data);
        if(temp==null){
            head=x;
        }
        else{
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=x;
        }
    }
    void print(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        String str="dfhsjdfsd23423423";
        solution(str);
    }
    private static void solution(String str) {
        Alphanumeric letter=new Alphanumeric();
        Alphanumeric digit=new Alphanumeric();
        for(int i=0; i<str.length(); i++) {
            char temp=str.charAt(i);
            if(Character.isLetter(temp)){
                letter.push(temp);
            }
            else{
                digit.push(temp);
            }
        }
        letter.print();
        digit.print();

    }

}
