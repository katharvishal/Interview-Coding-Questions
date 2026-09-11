public class QueueUsingArray {
    private int[] queue;
    private int front;
    private int rear;
    private int capacity;
    private int size;

    public QueueUsingArray(int size){
        this.capacity = size;
        this.front = 0;
        this.rear = -1;
        this.size = 0;
        this.queue = new int[capacity];
    }

    public int dequeue(){
        if(front == rear){
            System.out.println("Queue is empty");
            return -1;
        }

        int dequeueData = queue[front];
        front++;
        return dequeueData;
    }

    public int enqueue(int data){
        if(rear == capacity){
            System.out.println("Queue is Full");
        }

        ++rear;
        queue[rear] = data;
        return data;

    }


    public static void main(String[] args) {
        QueueUsingArray queue = new QueueUsingArray(5);

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);

        queue.peek();
    }
}
