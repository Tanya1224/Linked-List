package SinglyLinkedList;
import java.util.*;
class Node{
    int data;
    Node next;
    Node(int x){
        data=x;
        next=null;
    }
}
public class searchinLL {
    public static void main(String[] args) {
        Node head=new Node(15);
         head.next=new Node(25);
         head.next.next=new Node(35);
        head.next.next.next=new Node(45);
         head.next.next.next.next=new Node(55);
        print(head);
        System.out.println(search(head,35));
    }
    static int search(Node head, int x){
        int pos=1;
        Node curr=head;
        while(curr!=null){
            if(curr.data==x) return pos;
        else{
        pos++;
        curr=curr.next;
        }
    }
    return -1;
}

public static void print(Node head){
    Node curr=head;
    while(curr!=null){
        System.out.println(curr.data);
        curr=curr.next;
    }
}
}
