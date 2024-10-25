package LinkedLists;

public class SinglyLinkedList{
    Node head;
    Node tail;
    int size;

    public void printData(){
        if(size==0){
            System.out.println("There is Nothing in the list!");
        }
        else
        {
            Node currentNode = head;
            while (currentNode!=null){
                System.out.print(currentNode.getData()+ " => ");
                currentNode = currentNode.next;
            }
            System.out.println("null");

        }
    }

    public void append(int data){
        Node newNode = new Node(data);
        if(size==0){
            head = tail = newNode;
            size++;
        }
        else{
            Node currentNode = head;
            while(currentNode.next != null){
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
            head = tail = newNode;
            size++;
        }
        else{
            newNode.next = head;
            head = newNode;
            size++;
        }
    }

    public void removeFirst(){
        if(size==0){
            return;
        }else if(size==1){
            head = tail = null;
        }else{
            head = head.next;
        }
    }
    public void removeLast(){
        if(size==0){
            return;
        }else if(size==1){
            head = tail = null;
        }else{
            Node currentNode =  head;
            while(currentNode.next!=tail){
                currentNode = currentNode.next;
            }
            currentNode.next = null;
            tail = currentNode;
            size--;
        }
    }

    public void checkNode(int data){
        int index = 0;
        if(size==0){
            return;
        }
        else{
            Node currentNode = head;

            while(currentNode !=null){
                if(currentNode.getData()==data){
                    System.out.println("Node "+ currentNode.getData() + " found at index "+ index);
                }
                currentNode = currentNode.next;
                index++;
            }
        }

    }

    public void deleteNode(int data) {
        if (size == 0) {
            return;
        }
    
        Node currentNode = head;
        Node previousNode = null;
    
        while (currentNode != null) {
            if (currentNode.getData() == data) {
                // If the node to be deleted is the head node
                if (previousNode == null) {
                    head = currentNode.next; // Move head
                } else {
                    previousNode.next = currentNode.next; // Bypass the current node
                }
                size--;
                break; // Remove only the first occurrence and break the loop
            }
            previousNode = currentNode;
            currentNode = currentNode.next;
        }
    }
    


}