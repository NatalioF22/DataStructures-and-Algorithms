package LinkedLists;

public class App {
    public static void main(String[] args) {
       SinglyLinkedList linkedList = new SinglyLinkedList();
       linkedList.printData();
       linkedList.append(10);
       linkedList.append(20);
       linkedList.printData();
       linkedList.addFirst(90);
       linkedList.addFirst(80);
       linkedList.printData();
       linkedList.removeFirst();
       linkedList.printData();
       linkedList.removeLast();
       linkedList.printData();
       linkedList.checkNode(10);
       linkedList.addFirst(99);
       linkedList.addFirst(100);
       linkedList.deleteNode(10);
       linkedList.printData();
       linkedList.insertNode(1, 22);
       linkedList.printData();
    }

}
