package LinkedLists;

public class SinglyLinkedList
{ 
    Node head;
    int size;

    public void printData(){
        Node node = head;
        while(node.next != null){
            System.out.println(node.data);
            node = node.next;
        }
        System.out.println(node.data);
    }

    public void insertData(int data){
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = null;
        if(head==null){
            head = newNode;
        }
        else{
            Node n = head;
            while(n.next != null){
                n = n.next;
            }
            n.next = newNode;
        }

    }
}
