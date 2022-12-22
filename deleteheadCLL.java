package SinglyLinkedList.CircularLinkedList;
import java.util.*;
class Node{
    int data;
    Node next;
    Node(int x){
        data=x;
        next=null;
    }
}
public class deleteheadCLL {
    static Node del(Node head){
        if(head==null) return null;
        if(head.next==null) return null;
        Node  curr=head;
        while(curr.next!=head)
        curr=curr.next;
        curr.next=head.next;
        return curr.next;
    }
    public static void main(String[] args) {
        Node head=new Node(10);
        head.next=new Node(20);
    	head.next.next=new Node(30);
    	head.next.next.next=head;
    	head=del(head);
    	print(head);
    }
    static void print(Node head){
        if(head==null) return;
        System.out.println(head.data+" ");
        for(Node r=head.next;r!=head;r=r.next){
            System.out.println(r.data+" ");
        }
    }
}
