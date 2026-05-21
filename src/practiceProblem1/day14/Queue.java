package practiceProblem1.day14;

public class Queue {
    public static void main(String[] args) {
        QLinkedList list=new QLinkedList();
        list.addNode(70);
        list.addNode(30);
        list.addNode(56);
        System.out.println("The Queue is ");
        list.displayLinkedList();
        System.out.println();
        int queueLength=list.size();
        for(int i=0;i<queueLength;i++){
            System.out.println("Poped "+list.dequeue());
        }
    }
}

class QNode{
    int data;
    QNode next;
    public QNode(int data) {
        this.data = data;
    }

}
class QLinkedList{
    QNode head;
    void addNode(int data){
        QNode node=new QNode(data);
        if(head==null){
            head=node;
        }
        else{
            QNode curr=head;
            while(curr.next != null){
                curr=curr.next;
            }
            curr.next=node;
        }
    }
    void displayLinkedList(){
        QNode curr=head;
        while(curr != null){
            System.out.print(curr.data+" ");
            curr=curr.next;
        }

    }
    public int size(){
        int length=0;
        QNode curr=head;
        while(curr != null){
            length++;
            curr=curr.next;
        }
        return length;
    }
    public int dequeue(){
        if(head.next == null){
            int data=head.data;
            head=null;
            return data;
        }
        else{
            QNode curr=head;
            int data=curr.data;
            head=head.next;
            curr.next=null;
            return data;
        }
    }
}