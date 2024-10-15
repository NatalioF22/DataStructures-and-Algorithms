package LinkedLists;

public @interface LL {
//backup Code

public class SinglyLinkedList {
    Node head;
    Node tail;
    int size;

    public void printData(){
        if(size == 0){
            System.out.println("The Linked List is empty");
        } else {
            Node current = head;
            while(current != null){
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
        if(size == 0){
            tail = newNode;  // Update 'tail' if list was empty
        }
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
        if(size == 0){
            System.out.println("There is nothing on the list!");
        } else {
            head = head.next;
            size--;
            if(size == 0){
                tail = null;  // Update 'tail' when list becomes empty
            }
        }
    }

    public void removeLast(){
        if(size == 0){
            System.out.println("There is nothing on the list!");
        } else if(size == 1){
            head = null;
            tail = null;  // Update 'tail' to null
            size--;
        } else {
            Node current = head;
            while(current.next != tail){
                current = current.next;
            }
            current.next = null;
            tail = current;  // Update 'tail' to the new last node
            size--;
        }
    }

    public void reverseList() {
        if (size <= 1) {
            return;  // No need to reverse
        }
        Node previousNode = null;
        Node currentNode = head;
        tail = head;  // Update 'tail' to the original head
        while (currentNode != null) {
            Node tempNode = currentNode.next;
            currentNode.next = previousNode;
            previousNode = currentNode;
            currentNode = tempNode;
        }
        head = previousNode;  // Update 'head' to the new first node
        // 'tail.next' is already null after reversal
    }
}

}
