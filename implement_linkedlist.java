package Basic.programming_java;

public class implement_linkedlist {
    public static class Node{
        int data;
        Node next;
        Node (int data){
            this.data=data;
        }
    }
    public static class linkedlist{
        Node head=null;
        Node tail=null;
        void insertAtEnd(int val){
            Node temp=new Node(val);
            if(head==null){
                head=temp;
//                tail=temp;
            }
            else{
                tail.next=temp;
//                tail=temp;
            }
            tail=temp;
        }
        void display(){
            Node temp=head;

            while (temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
        }
        int size(){
            Node temp=head;
            int count=0;

            while (temp!=null){
                count++;
                temp=temp.next;
            }
            return count;
        }

        void insertAtHead(int val){
            Node temp=new Node(val);
            if(head==null){
                head=tail=temp;
            }
            else{
                temp.next=head;
                head=temp;
            }
        }

    }
    public static void main(String[] args) {
        linkedlist ll=new linkedlist();
        ll.insertAtEnd(4);
        ll.insertAtEnd(5);
//        ll.display();
//        System.out.println(ll.size());
        ll.insertAtEnd(12);
//        ll.display();
        ll.insertAtHead(13);
        ll.insertAtHead(14);
        ll.display();


    }
}
