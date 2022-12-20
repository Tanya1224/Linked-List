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
public class insertGivenPos {
    public static void main(String[] args) {
        Node head=new Node(10);
    	head.next=new Node(20);
    	head.next.next=new Node(30);
        head.next.next.next=new Node(40);
        head.next.next.next.next=new Node(50);
        head.next.next.next.next.next=new Node(60);
        print(head);
        head=ins(head, 3, 80);
        print(head);
    }
     static Node ins(Node head,int pos, int data){
        Node temp=new Node(data);
        if(pos==1){
            temp.next=head;
            return temp;
        }
        Node curr=head;
        for(int i=0;i<=pos-2 && curr!=null;i++) curr=curr.next;
        if(curr==null) return head;
        temp.next=curr.next;
        curr.next=temp;
        return head;
     }
     public static void print(Node head){
        Node curr=head;
        while(curr!=null){
            System.out.println(curr.data);
            curr=curr.next;
        }
    }
}
