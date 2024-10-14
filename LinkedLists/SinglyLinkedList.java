package LinkedLists;

public class SinglyLinkedList
{ 
    Node head;
    int size;

    public void printData(){
        Node node = head;
        while(node.next != null){
            System.out.println("Node=> "+ node.data);
            node = node.next;
        }
        System.out.println("Node=> " + node.data);
    }
    public void getSize(){
        System.out.println("LinkedList Size: "+ size);
    }

    public void insertData(int data){
        //adds data lastly
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = null;
        if(head==null){
            head = newNode;
            size+=1;
        }
        else{
            Node n = head;
            while(n.next != null){
                n = n.next;
            }
            n.next = newNode;
            size+=1;
        }
    }

    public void addFirst(int data){
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = head;
        head = newNode;
        size+=1;
        
    }

    
}
