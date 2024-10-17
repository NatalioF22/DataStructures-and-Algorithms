package LinkedLists;

public class SinglyLinkedList {
    Node head;
    Node tail;
    int size;

    public void printData(){
        if(size==0){
            System.out.println("The list is empty!");
        }
        else{
            Node current = head;
            while(current!=null){
                System.out.print(" => " + current.getData());
                current = current.next;
            }
            System.out.println(" => null");
        }
    }
    public void apend(int data){
        Node newNode = new Node(data);
        if(size==0){
            head = tail = newNode;
            size++;
        }else{
            Node currentNode = head;
            while(currentNode.next!=null){
                currentNode = currentNode.next;
            }
            newNode.next = head;
            head = newNode;
            size++;
        }
    }
    public void addLast(int data){
        Node newNode =new Node(data);
        if(size==0){
            head = tail = newNode;
            size++;
        }else{
            Node currentNode = head;
            while(currentNode.next!=null){
                currentNode = currentNode.next;
            }
            currentNode.next = newNode;
            newNode= tail;
            size++;
        }
    }

    public void pop(){
        if(size==0){
            System.out.println("Nothing to remove here");
            return;
        }else if(size==1){
            head = tail = null;
        }
        else{
            head = head.next;
            size--;
        }
    }

    public void removeLast(){
        if(size==0){
            System.out.println("Nothing to remove here");
            return;
        }else if(size==1){
            head = tail = null;
            size--;
        }else{
            Node currentNode = head;
            while(currentNode != tail){
                currentNode = currentNode.next;
            }
            currentNode.next = null;
            tail = currentNode;
            size--;

        }
    }
}