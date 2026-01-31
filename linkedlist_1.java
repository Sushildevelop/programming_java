package Basic.programming_java;

public class linkedlist_1 {
    public static void displayrecursive(Node head){
        if(head==null) return;
        System.out.println(head.data + " ");
        displayrecursive(head.next);
    }
    public static void displayreverse(Node head){
        if(head==null) return;
        displayreverse(head.next);
        System.out.println(head.data + " ");
    }

    public static void display(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data + " ");
            temp=temp.next;
        }
    }
    public static int length(Node head){
        int count=0;
        while(head !=null){
            count++;
            head=head.next;

        }
        return  count;
    }
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static void main(String[] args) {
//        Node x=new Node();
        Node a=new Node(1);

        Node b=new Node(2);
        Node c=new Node(3);
        Node d=new Node(4);
        Node e=new Node(5);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
//        System.out.println(a);
//        System.out.println(a.next);
//        System.out.println(b);
//        System.out.println(c);
//        System.out.println(a.next.data);
        Node temp=a;

//        for(int i=1;i<=5;i++){
//            System.out.print(temp.data + " ");
//            temp=temp.next;
//        }

        display(a);
        System.out.println();
        System.out.println(length(a));



    }
}
