package LinkedLists;

public class App {
    public static void main(String[] args) {
        SinglyLinkedList linkedlIst = new SinglyLinkedList();
        linkedlIst.insertData(5);
        linkedlIst.insertData(7);
        linkedlIst.printData();
        linkedlIst.getSize();
        linkedlIst.addFirst(1);
        linkedlIst.getSize();

        linkedlIst.getSize();

        System.out.println("Linked List Data: ");
        linkedlIst.printData();

        
    }
}
