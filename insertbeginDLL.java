package SinglyLinkedList.DoublyLinkedList;
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
public class insertbeginDLL {
   static Node insert(Node head,int data){
        Node temp=new Node(data);
        temp.next=head;
        if(head!=null) head.prev=temp;
        return temp;
    }
    public static void main(String[] args) {
        Node head=new Node(10);
    	Node temp1=new Node(20);
    	Node temp2=new Node(30);
    	head.next=temp1;
    	temp1.prev=head;
    	temp1.next=temp2;
    	temp2.prev=temp1;
        head=insert(head, 5);
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
 