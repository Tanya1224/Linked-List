package SinglyLinkedList.CircularLinkedList;
import java.util.*;
class Node{
        int data;
        Node next;
        Node(int d){
            data=d;
            next=null;
        }
    }
public class deleteKthCLL {
    public static void main(String args[]) 
    { 
        Node head=new Node(10);
    	head.next=new Node(20);
    	head.next.next=new Node(30);
    	head.next.next.next=new Node(40);
    	head.next.next.next.next=head;
    	head=deleteKth(head,3);
    	print(head);
    	
    } 

    static Node deleteKth(Node head,int k){
        if(head==null)return head;
        if(k==1)return deleteHead(head);
        Node curr=head;
        for(int i=0;i<k-2;i++)
            curr=curr.next;
        curr.next=curr.next.next;
        return head;
    }
    
    static Node deleteHead(Node head){
        if(head==null)return null;
        if(head.next==head)
            return null;
        head.data=head.next.data;
        head.next=head.next.next;
        return head;
    }   
    static void print(Node head){
        if(head==null) return;
        System.out.println(head.data+" ");
        for(Node r=head.next;r!=head;r=r.next){
            System.out.println(r.data+" ");
        }
    }
}
