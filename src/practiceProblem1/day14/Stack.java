package practiceProblem1.day14;

public class Stack {
    public static void main(String[] args) {
        LinkedList list=new LinkedList();
        list.addNode(70);
        list.addNode(30);
        list.addNode(56);
        System.out.println("The Stack is ");
        list.displayLinkedList();
        System.out.println();
        System.out.println("The Top Most Element is ");
        System.out.println(list.peek());
        int size=list.size();
        for(int i=0;i<size;i++){
            System.out.println("The Recently poped element is : "+list.pop());
        }
        System.out.println("After Poping ");
        list.displayLinkedList();
    }
}
class Node{
    int data;
    Node next;
    public Node(int data) {
        this.data = data;
    }

}
class LinkedList{
    Node head;
    public void addNode(int data){
        Node node=new Node(data);
        if(head==null){
            head=node;
        }
        else{
            node.next=head;
            head=node;
        }
    }
    public void displayLinkedList(){
        Node curr=head;
        while(curr != null){
            System.out.print(curr.data+" ");
            curr=curr.next;
        }
    }
    public int peek(){
        if(head != null){
            return head.data;
        }
        return Integer.MIN_VALUE;
    }
    public int pop(){
        if(head.next==null){
            int data=head.data;
            head=null;
            return data;
        }
        else{
            Node curr=head;
            head=head.next;
            curr.next=null;
            return curr.data;
        }
    }
    public int size(){
        int size=0;
        Node curr=head;
        while(curr != null){
            size++;
            curr=curr.next;
        }
        return size;
    }
}