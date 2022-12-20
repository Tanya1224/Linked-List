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
public class insertend {
    public static Node insert(Node head,int x){
    Node temp=new Node(x);
    if(head==null) return temp;
    Node curr=head;
    while(curr.next!=null) curr=curr.next;
    curr.next=temp;
    return head;
    }
    public static void main(String[] args) {
        Node head=null;
        head=insert(head, 30);
        head=insert(head, 40);
        head=insert(head, 40);
        print(head);
    }
    public static void print(Node head){
        Node curr=head;
        while(curr!=null){
            System.out.println(curr.data);
            curr=curr.next;
        }
    }
}
