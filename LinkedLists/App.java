package LinkedLists;

public class App {
    public static void main(String[] args) {
       SinglyLinkedList linkedList = new SinglyLinkedList();
       linkedList.printData();
       linkedList.addLast(20);
       linkedList.addFirst(0);
       linkedList.addFirst(10);
       linkedList.addLast(40);
       linkedList.printData();
       linkedList.pop();
       linkedList.printData();
       linkedList.removelast();
       linkedList.printData();
    }
}
