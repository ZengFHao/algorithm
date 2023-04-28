package Queue;

public class PriorityQueue {
    static class Node{
        int value;
        int priority;
        Node next;

        Node(int value,int priority){
            this.value=value;
            this.priority=priority;
            next=null;
        }

    }
    Node head=null;
    public void insert(int value,int priority){
        Node node=new Node(value,priority);
        if(head==null){
            head=node;
        }else{
            Node cur=head;
            if(head.priority>node.priority){
                node.next=head;
                head=node;
            }else{
                while(cur.next!=null && cur.next.priority<=node.priority){
                    cur=cur.next;
                }
                node.next=cur.next;
                cur.next=node;
            }

        }
    }

    public Node pop(){
        if(head==null){
             return null;
        }else{
            Node popNode=head;
            head=head.next;
            System.out.println("The value: "+popNode.value+" priority: "+popNode.priority);
            return popNode;
        }
    }

    public boolean isEmpty(){
        if(head==null){
            return true;
        }else{
            return false;
        }
    }

    public void print(){
        if(isEmpty()){
            System.out.println("Queue is null");
        }else{
            while(head!=null){
                pop();
            }

        }
    }


}
