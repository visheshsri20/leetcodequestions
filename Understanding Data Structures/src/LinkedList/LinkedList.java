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
//Method to prepend or add a node in the first index
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
    //Method to get a node
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
    //Method to set a node
    public boolean set (int index,int value)
    {
        Node temp = get(index);
        if(temp!=null)
        {
            temp.value=value;
            return true;
        }
        return false;
    }

    public void reverse()
    {
        Node temp =head ;
        head = tail;
        tail = temp;
        Node after = temp.next;
        Node before = null;
        for(int i =0;i<length;i++)
        {
            after=temp.next;
            temp.next=before;
            before=temp;
            temp=after;
        }
    }
}