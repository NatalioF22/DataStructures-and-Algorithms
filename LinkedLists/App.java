package LinkedLists;

public class App {
    public static void main(String[] args) {
       SinglyLinkedList linkedList = new SinglyLinkedList();
      
       linkedList.addFirst(90);
       linkedList.addFirst(80);
       linkedList.printData();
       linkedList.addLast(34);
       linkedList.printData();
       linkedList.removeLast();;
       linkedList.printData();
       linkedList.addFirst(100);
       linkedList.addLast(89);
       linkedList.checkData(80);
       linkedList.printData();
       linkedList.insertNode(2, 111);
       linkedList.printData();

    }

}
