
public class CustomerServeUsingQueue {
    class Node{
        String name;
        Node next;
        
        public Node(String name){
            this.name = name;
            this.next = null;
        }
    }

    private int capacity;
    private int currentSize;
    private Node front;
    private Node rear;
    private String[] customer;

    public CustomerServeUsingQueue(int capacity) {
        this.capacity = capacity;
        this.currentSize = 0;
        this.front = null;
        this.rear = null;
        this.customer = new String[capacity];
    }

    public void enqueue(String name){
        Node newNode = new Node(name);
        if(rear == null){
            front = newNode;
            rear = newNode;
        }else{
            rear.next = newNode;
            rear = newNode;
        }
        
        currentSize++;
    }

    public void dequeue(){
        if(front == null){
            System.out.println("Queue is empty");
            return;
        }
        front = front.next;

        currentSize--;
    }

    public void display(){
        Node current = front;

        while(current!=null){
            System.out.print(current.name+ " |");
            current = current.next;
        }
        System.out.print("Null");
    }
    

    public static void main(String[] args) {
        CustomerServeUsingQueue customer = new CustomerServeUsingQueue(10);

        customer.enqueue("Vishal");
        customer.enqueue("Rahul");
        customer.enqueue("Rohan");
        customer.enqueue("Harshal");
        customer.enqueue("Om");

        customer.display();
    }
}
