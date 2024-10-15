package LinkedLists;

public class SinglyLinkedList{
    Node head;
    Node tail;
    int size;

    public void printData(){
        if(size==0){
            System.out.println("The Linked List is empty");
        }
        else{
            Node current = head;
            while(current!=null){
                System.out.print(current.data + " => ");
                current = current.next;
            }
            System.out.println("null");
        }
    }

    public void addFirst(int data){
       
            Node newNode = new Node(data);
            newNode.next = head;
            head = newNode;
            size++;
        
    }

    public void addLast(int data){
        Node newNode = new Node(data);
        if(size == 0){
            head = newNode;
            tail = newNode;  // Update 'tail' as well
        } else {
            tail.next = newNode;  // Use 'tail' to add new node
            tail = newNode;       // Update 'tail' to the new last node
        }
        size++;
    }
    

    public void pop(){
        if(size==0){
            System.out.println("There is nothing on the list!");
        }else if(size == 1){
            head = null;
        }else{
            Node current = head;
            head = current.next;
        }
    }

    public void removeLast(){
        if(size==0){
            System.out.println("There is nothing on the list!");
        }else if(size == 1){
            head = null;
            size--;
        }else{
            Node current = head;
            while(current.next.next!=null){
                current = current.next;
            }
            current.next = null;
            tail = current;
            size--;
            
        }
    }

    public void reverseList() {
        if (size <= 1) {
            return;  // No need to reverse
        }
        Node previousNode = null;
        Node currentNode = head;
        tail = head;  // Update the class-level 'tail' to the original head
        while (currentNode != null) {
            Node tempNode = currentNode.next;
            currentNode.next = previousNode;
            previousNode = currentNode;
            currentNode = tempNode;
        }
        head = previousNode;  // Update the head to the new first node
        // Ensure the new tail points to null (already handled in the loop)
    }
    

}