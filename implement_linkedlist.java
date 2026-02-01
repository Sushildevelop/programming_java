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
            System.out.println();
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
        void insertAt(int idx,int val){
            Node t=new Node(val);
            Node temp=head;
            if(idx<0 || idx>size()){
                System.out.println("Wrong Index");
                return;
            }
            if(idx==size()){
                insertAtEnd(val);
                return;
            }
            if(idx==0){
                insertAtHead(val);
                return;
            }
            for(int i=1;i<=idx-1;i++){
                temp=temp.next;
            }
            t.next=temp.next;
            temp.next=t;
        }

        int getAt(int idx){
            Node temp=head;
            for(int i=1;i<=idx;i++){
                temp=temp.next;
            }
            return temp.data;
        }
        void deletedAt(int idx){
            if(idx==0) head=head.next;
            Node temp=head;
            for(int i=1;i<=idx-1;i++){
                temp=temp.next;
            }
            temp.next=temp.next.next;
            tail=temp;

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
        ll.insertAt(4,30);
        ll.deletedAt(4);
        ll.display();
        System.out.println("Get At"+ll.getAt(4));



    }
}
