package LinkedList;

public class LinkedList
{
    private Node head;
    private Node tail;
    private int length;

    class Node
    {
        int value;
        Node next;

        Node (int value)
        {
            this.value=value;
        }
    }
    public LinkedList (int value)
    {
        Node newNode=new Node(value);
        head = newNode;
        tail=newNode;
        length=1;
    }
//Method to print the linked list
    public void printList()
    {
        Node temp=head;
        while(temp != null)
        {
            System.out.print(temp.value+"-->");
            temp=temp.next;
        }
    }
//Method to append the linkedlist
    public void append (int value)
    {
        Node newNode=new Node(value);
        if(length==0)
        {
            head = newNode;
            tail=newNode;
        }
        else
        {
            tail.next=newNode;
            tail=newNode;
        }
        length++;
    }
//Method to remove the last node of the linked list
    public Node removeLast()
    {
        if(length == 0) return null;
        Node temp = head;
        Node pre = head;
        while (temp.next != null)
        {
            pre = temp;
            temp = temp.next;
        }
        tail = pre;
        tail.next = null;
        length --;
        if(length == 0)
        {
            head = null;
            tail = null;
        }
        return temp;
    }

    public void prepend(int value)
    {
        Node newNode = new Node(value);
        if(length == 0) {
            head = newNode;
            tail = newNode;

        }
        else{
            newNode.next = head;
            head = newNode;
        }
        length++;
    }
    public Node get(int index)
    {
        if(index<0||index>=length)
        {
            return  null;
        }
        Node temp=head;
        for(int i =0;i<index;i++)
        {
            temp=temp.next;
        }
        return temp;
    }
}