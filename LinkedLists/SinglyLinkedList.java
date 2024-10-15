package LinkedLists;

public class SinglyLinkedList{
    Node head;
    Node tail;
    int size;
    public void printData(){
        if(size==0){
            System.out.println("There is nothing in the List!");
        }else{
            Node currentNode = head;
            while(currentNode!=null){
                System.out.print(currentNode.data + " => ");
                currentNode = currentNode.next;
            }
            System.out.println(" null");
        }
    }
    public void addFirst(int data){
        Node newNode = new Node(data);
        if(size==0){
       
        head = newNode;
        tail = newNode;
        size++;
        }else{
            newNode.next = head;
            head = newNode;
            size++;
        }
      
    }
    
    public void addLast(int data){
        Node newNode = new Node(data);
        if(size==0){
            head = newNode;
            tail = newNode;
            size++;
        }else{
        newNode.next = tail;
        tail = newNode;
        size++;
        }
    }

    
    public void removeLast(){
        if(size==0){
            System.out.println("There is Nothing in the list");
        }else if(size==1){
            head = null;
            tail = null;
            size--;
        }else{
            Node currentNode = head;
            while(currentNode.next != tail){
                currentNode = currentNode.next;
            }
            currentNode.next = null;
            tail = currentNode;
            size--;
        }
    }

    public void removeFirst(){
        if(size==0){
            System.out.println("There is Nothing in the list");
        }else {
            head = head.next;
            size--;
        }
    }

    public void reverseList(){
        if(size<=1){return;}
        else{

        }
    }



}