package SinglyLinkedList;

public class deleteLoopinLL {
    static Node head;
    static class Node{
        int data;
        Node next;
        Node(int d){
            data=d;
            next=null;
        }
    }
    void detectandremove(Node head){
        if(head==null || head.next==null){
            return;
        }
        Node slow=head;
        Node fast=head;
        slow=slow.next;
        fast=fast.next.next;
        while (fast != null && fast.next != null) {
            if (slow == fast)
                break;
                slow = slow.next;
            fast = fast.next.next;
        }
        if (slow == fast) {
            slow = head;
            if (slow != fast) {
                while (slow.next != fast.next) {
                    slow = slow.next;
                    fast = fast.next;
                }
                fast.next = null; /* remove loop */
            }
            else {
                while(fast.next != slow) {
                    fast = fast.next;
                }
                fast.next = null;
            }
        }
    }
    void printList(Node node)
    {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }
    public static void main(String[] args) {
        deleteLoopinLL list=new deleteLoopinLL();
        list.head = new Node(50);
        list.head.next = new Node(20);
        list.head.next.next = new Node(15);
        list.head.next.next.next = new Node(4);
        list.head.next.next.next.next = new Node(10);
        head.next.next.next.next.next = head.next.next;
        list.detectandremove(head);
        System.out.println("Linked List after removing loop : ");
        list.printList(head);

    }
}
