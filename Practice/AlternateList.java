package Practice;

class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class AlternateList {
    public static Node inserNode(Node head, int data) {
        
        Node temp = head;
        Node newNode = new Node(data);
        if(head == null) {
            newNode.next = head;
            head = newNode;
        }else {
            while(temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
        return head;
    }
    public static void printNode(Node head) {
        Node temp = head;
        System.out.print("Node data:- ");
        while(temp != null) {
            System.out.print(temp.data + ", ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static int count(Node head) {
        Node temp = head;
        int size = 0;
        while(temp != null) {
            size++;
            temp = temp.next;
        }
        return size;
    }
    public static Node alter(Node head1, Node head2, Node alNode) {
        Node temp1 = head1;
        Node temp2 = head2;

        while(temp1 != null && temp2 != null) {
            alNode.data = temp1.data;
            alNode = alNode.next;
            temp1 = temp1.next;
            alNode.data = temp2.data;
            alNode = alNode.next;
            temp2 = temp2.next;
        }
        return alNode;
    }
    public static void main(String[] args) {
        Node obj1 = new Node(10);
        obj1 = inserNode(obj1, 20);
        obj1 = inserNode(obj1, 30);
        obj1 = inserNode(obj1, 40);
        obj1 = inserNode(obj1, 50);
        printNode(obj1);
        int counter1 = count(obj1);
        System.out.println("size of first list:- " + counter1);
        Node obj2 = new Node(90);
        obj2 = inserNode(obj2, 100);
        obj2 = inserNode(obj2, 200);
        obj2 = inserNode(obj2, 300);
        printNode(obj2);
        int counter2 = count(obj2);
        System.out.println("size of second list:- " + counter2);
        Node alNode = new Node(0);
        alNode = alter(obj1, obj2, alNode);
        printNode(alNode);
    }
}
