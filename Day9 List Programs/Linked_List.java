class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
class LinkedList{
    Node head;
    LinkedList(){
        this.head=null;
    }

    //creating linkedlist
    public void create(){
        Node n1=new Node(5);
        this.head=n1;
        Node n2=new Node(8);
        n1.next=n2;
        Node n3=new Node(11);
        n2.next=n3;
        Node n4=new Node(20);
        n3.next=n4;
    }

    //appending elements
    public void append(Node newNode){
        Node current=this.head;
        if(current==null){
            this.head=newNode;
        }
        else{
            while(current.next!=null){
                current=current.next;
            }
            current.next=newNode;
        }
    }

    //inserting elements
    public void insert(Node newNode,int index){
        Node current=this.head;
        if(index==0){
            newNode.next=current;
            this.head=newNode;
        }
        else{
            for(int i=0;i<(index-1) && current!=null;i++){
                current=current.next;
            }
            if(current!=null){
                newNode.next=current.next;
                current.next=newNode;
            }
        }
    }

    //deleting elements
    public int delete(int index){
        Node current=this.head;
        Node prev=null;
        int delVal=-1;
        if(index==0){
            delVal=this.head.data;
            this.head=this.head.next;
            return delVal;
        }
        else{
            for(int i=0;i<index && current!=null;i++){
                prev=current;
                current=current.next;
            }
            if(current!=null){
                delVal=current.data;
                prev.next=current.next;
            }
            return delVal;
        }
    }

    //displaying linkedlist
    public void display(){
        Node current=this.head;
        while(current!=null){
            System.out.println(current.data);
            current=current.next;
        }
    }
}
public class Linked_List {
    public static void main(String args[]){
        LinkedList l=new LinkedList();
        Node newNode1=new Node(25);
        Node newNode2=new Node(30);
        l.create();
        l.append(newNode1);
        l.insert(newNode2,2);
        l.delete(3);
        l.display();
    }
}
