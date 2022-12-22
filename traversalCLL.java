package SinglyLinkedList.CircularLinkedList;

import java.sql.PseudoColumnUsage;

class Node{
    int data;
    Node next;
    Node(int x){
        data=x;
        next=null;
    }
}
public class traversalCLL {
    static void print(Node head){
        if(head==null) return;
        System.out.println(head.data+" ");
        for(Node r=head.next;r!=head;r=r.next){
            System.out.println(r.data+" ");
        }
    }
    public static void main(String[] args) {
        Node head=new Node(10);
    	head.next=new Node(5);
    	head.next.next=new Node(20);
    	head.next.next.next=new Node(15);
    	head.next.next.next.next=head;
    	print(head);
    }
}
