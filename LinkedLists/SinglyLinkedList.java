package LinkedLists;

public class SinglyLinkedList {
    Node head;
    Node tail;
    int size;

    public void printData(){
        if(size==0){
            System.out.println("The list is empty!");
        }else{
            Node currentNode = head;
            while(currentNode!=null){
                System.out.print("=> " + currentNode.getData());
                currentNode = currentNode.next;
            }
            System.out.println(" => null");
        }
    }
    public void addLast (int data){
        Node newNode = new Node(data);
        if(size==0){
           addIfSizeIsOne(newNode);
        }
        else
        {
            Node currentNode = head;
            while(currentNode.next!=null){
                currentNode = currentNode.next;
            }
            currentNode.next = newNode;
            tail = newNode;
            size++;
        }
    }

    public void addFirst(int data){
        Node newNode = new Node(data);
        if(size==0){
            addIfSizeIsOne(newNode);
        }
        else
        {
            newNode.next = head;
            head = newNode;
            size++;
        }
    }


    public void addIfSizeIsOne(Node newNode){
        head = tail = newNode;
        size++;
    }

}