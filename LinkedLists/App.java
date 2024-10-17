package LinkedLists;

public class App {
    public static void main(String[] args) {
        SinglyLinkedList linkedList = new SinglyLinkedList();
        linkedList.printData();
        linkedList.apend(10);
        linkedList.apend(30);
        linkedList.printData();
        linkedList.addLast(15);
        linkedList.printData();
        linkedList.pop();
        linkedList.printData();
        linkedList.apend(8);
        linkedList.printData();
        linkedList.removeLast();
        linkedList.printData();
    }
}
