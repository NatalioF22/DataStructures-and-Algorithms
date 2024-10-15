package LinkedLists;

public class App {
    public static void main(String[] args) {
        
        SinglyLinkedList linkedList = new SinglyLinkedList();
        linkedList.printData();
        linkedList.pop();
        linkedList.removeLast();
        linkedList.addLast(20);
        linkedList.addFirst(10);
        linkedList.printData();
        linkedList.removeLast();
        linkedList.printData();
        linkedList.addFirst(30);
        linkedList.addFirst(40);
        linkedList.addFirst(50);
        linkedList.addLast(60);
        linkedList.printData();


        linkedList.reverseList();
        linkedList.printData();
        
        
    }
}
