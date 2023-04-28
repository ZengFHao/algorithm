package Queue;

public class QueueTest {
    public static void main(String[] args) {
        PriorityQueue pq=new PriorityQueue();
        pq.insert(100,5);
        pq.insert(50,10);
        pq.insert(3,1);
        pq.insert(20,5);
        pq.insert(5,3);
        pq.print();
    }
}
