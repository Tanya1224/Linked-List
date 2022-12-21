package TREES.SinglyLinkedList.DoublyLinkedList;
import java.util.*;
class Node{
    int data;
    Node prev;
    Node next;
    Node(int x){
        data=x;
        next=prev=null;
    }
}  
public class reverseDLL {
    static Node reverse(Node head){
        if(head==null || head.next==null) return head;
        Node prev=null;
        Node curr=head;while(curr!=null){
            prev=curr.prev;
            curr.prev=curr.next;
            curr.next=prev;
        }
        return prev.prev;
    }
    public static void main(String[] args) {
        Node head=new Node(10);
        Node temp1=new Node(20);
        Node temp2=new Node(30);
    	head.next=temp1;
    	temp1.prev=head;
    	temp1.next=temp2;
    	temp2.prev=temp1;
        reverse(head);
        print(head);
    }
    public static void print(Node head){
        Node curr=head;
        while(curr!=null){
        System.out.print(curr.data+" ");
        curr=curr.next;
    }System.out.println();
    }
}
