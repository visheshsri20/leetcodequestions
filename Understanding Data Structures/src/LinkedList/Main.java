package LinkedList;

public class Main {

    public static void main(String[] args) {

        LinkedList myLinkedList = new LinkedList(1);

        myLinkedList.append(2);
//        myLinkedList.append(3);
//        myLinkedList.append(4);
//        myLinkedList.append(5);
       myLinkedList.printList();
       System.out.println();
       myLinkedList.removeLast();
       myLinkedList.printList();
        System.out.println();
       myLinkedList.prepend(0);
        myLinkedList.append(2);
        myLinkedList.printList();
        System.out.println();
       System.out.println(myLinkedList.get(1).value);

        /*
            EXPECTED OUTPUT:
            ----------------
            Head: 4
            Tail: 4
            Length: 1

            Linked List:
            4

        */

    }

}
