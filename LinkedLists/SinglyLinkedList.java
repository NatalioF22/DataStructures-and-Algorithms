package LinkedLists;

public class SinglyLinkedList{
    Node tail,head;
    int size;

    public void getSize()
    {
        System.out.println(size);
    }

    public void printData()
    {
        if(size==0){
            System.out.println("Empty List!");
        }
        else
        {
            Node currentNode = head;
            while(currentNode!=null){
                System.out.print(currentNode.getData() + " => ");
                currentNode = currentNode.next;
            }
            System.out.println(" null");
        
        }
    }

    public void addFirst(int data)
    {
        Node newNode = new Node(data);
        if(size==0)
        {
            head = tail = newNode;
            size++;
        }
        else
        {
            newNode.next = head;
            head = newNode;
            size++;
        }
    }

    public void addLast(int data)
    {
        Node newNode = new Node(data);
        if(size==0){
            head = tail = newNode;
            size++;
        }
        else
        {
            Node currentNode = head;
            while(currentNode.next!= null){
                currentNode = currentNode.next;
            }
            currentNode.next = newNode;
            tail = newNode;
            newNode.next = null;
            size++;
        }
    }

    public void pop()
    {
        if(size==0) {
            return;
        } 
        else
        {
            head = head.next;
            size --;
        }
    }


    public void removeLast()
    {
        if (size==0)
         {return;}
        else if(size==1){
            head = tail = null;
        }
        else
        {
            Node currentNode = head;
            while(currentNode.next != tail)
            {
                currentNode = currentNode.next;
            }
            tail = currentNode;
            currentNode.next = null;
            size --;
        }
    }

    public void checkData(int data)
    {
        int index = 0;
        if(size==0){
            return;
        }
        else
        {
            Node currentNode = head;
            while(currentNode != null){

                if(currentNode.getData() == data){
                    System.out.println(index);
                    
                }
                index++;
                currentNode = currentNode.next;
            }
        }
    }

    public void insertNode(int index, int data) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Invalid index: " + index);
        }
    
        Node newNode = new Node(data);
    
        if (index == 0) { // Insertion at the head
            newNode.next = head;
            head = newNode;
            if (size == 0) { // List was empty, update tail
                tail = newNode;
            }
        } else if (index == size) { // Insertion at the tail
            tail.next = newNode;
            tail = newNode;
        } else { // Insertion in the middle
            Node currentNode = head;
            for (int i = 0; i < index - 1; i++) {
                currentNode = currentNode.next;
            }
            newNode.next = currentNode.next;
            currentNode.next = newNode;
        }
        size++;
    }
    
}
