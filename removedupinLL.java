package SinglyLinkedList;
class Node{
    int data;
    Node next;
    Node(int x){
        data=x;
        next=null;
    }
}
public class removedupinLL {
    static Node removeDuplicates(Node head)
    {
	Node a=head;
	Node b=a;
	if(head==null) return head;
	while(a.next!=null){
	    if(a.data==a.next.data){
	        a.next=a.next.next;
	    }
	    else{
	        a=a.next;
	    }
	}
	return head;
	
    }
    public static void print(Node head){
        Node curr=head;
        while(curr!=null){
            System.out.println(curr.data);
            curr=curr.next;
        }
    }
    public static void main(String[] args) {
        Node head=new Node(10);
    	head.next=new Node(20);
    	head.next.next=new Node(30);
        head.next.next.next=new Node(40);
        head.next.next.next.next=new Node(40);
        head.next.next.next.next.next=new Node(50);
       head=removeDuplicates(head);
    	print(head);
    }
}
