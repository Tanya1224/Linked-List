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
public class deletehead {
    public static void main(String[] args) {
        
        Node head=new Node(10);
    	head.next=new Node(20);
    	head.next.next=new Node(30);
        print(head);
        head=del(head);
        print(head);
    }
    static Node del(Node head){
        if(head==null) return null;
        else{
            return head.next;
        }
    }
    public static void print(Node head) {
        Node curr=head;
        while(curr!=null){
            System.out.println(curr.data+" ");
            curr=curr.next;
        }
        
    }
    
}
