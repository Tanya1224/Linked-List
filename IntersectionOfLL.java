package SinglyLinkedList;
class Node{
    int data;
    Node next;
    Node(int x){
        data=x;
        next=null;
    }
}
public class IntersectionOfLL {
    static Node findIntersect(Node head1, Node head2){
        Node temp=new Node(0);
        Node res=temp;
        while(head1!=null && head2!=null){
            if(head1.data==head2.data){
                temp.next=head1;
                temp=temp.next;
                head1=head1.next;
                head2=head2.next;
            }
             else if(head1.data>head2.data){
            head2=head2.next;
        }
        else if(head2.data>head1.data){
            head1=head1.next;
        }
        }
        temp.next=null;
        return res.next;
    }
    public static void print(Node head) {
        Node curr=head;
        while(curr!=null){
            System.out.print(curr.data+" ");
            curr=curr.next;
        }  
        System.out.println();
    }
    static Node push(Node head_ref, int new_data)
    {
        Node new_node = new Node(new_data);
        new_node.next = head_ref;
        head_ref = new_node;
        return head_ref;
    }
    public static void main(String[] args) {
        Node a = null;
        Node b = null;
        Node intersect = null;
        a = push(a, 6);
        a = push(a, 5);
        a = push(a, 4);
        a = push(a, 3);
        a = push(a, 2);
        a = push(a, 1);
        b = push(b, 8);
        b = push(b, 6);
        b = push(b, 4);
        b = push(b, 2);
        intersect = findIntersect(a, b);
        print(intersect);

    }
}
