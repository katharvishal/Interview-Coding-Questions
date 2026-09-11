public class QueueUsingLL {
    public class Node{
        int data;
        Node next;
        
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    
    private Node front;
    private Node rear;
    private int capacity;
    private int Currentsize;

    public QueueUsingLL(int size){
        this.capacity = size;
        this.front = null;
        this.rear = null;
        this.Currentsize = 0;
    }

    public void enqueue(int data){
        Node newNode = new Node(data);

        if(rear == null){
            front = newNode;
            rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
    }

    public void dequeue(){
        if(front == null){
            rear = null;
        }
        front = front.next;
    }

    public void peek(){
        if (front == null) {
            System.out.println("Queue is empty");
            return;
        }

        System.out.println("peek : " + front.data);
    }

    public void display(){
        Node current = front;

        while(current!=null){
            System.out.print(current.data+ " |");
            current = current.next;
        }
        System.out.print("Null");
    }

    public static void main(String[] args) {
       QueueUsingLL queueLL = new QueueUsingLL(5);

       queueLL.enqueue(10);
       queueLL.enqueue(20);
       queueLL.enqueue(30);

       queueLL.dequeue();
       queueLL.enqueue(40);
       queueLL.display();

       queueLL.peek();


    }
}
