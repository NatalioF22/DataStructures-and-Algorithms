package LinkedLists;

public class App {
    public static void main(String[] args) {
        SinglyLinkedList linkedList = new SinglyLinkedList();
        linkedList.printData();
        linkedList.addLast(29);
        linkedList.addFirst(10);
        linkedList.printData();
        linkedList.addFirst(12);
        linkedList.printData();
        linkedList.removeLast();
        linkedList.addFirst(192);
        linkedList.printData();
        linkedList.removeFirst();
        linkedList.printData();
        
    }
}
