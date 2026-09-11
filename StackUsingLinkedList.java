public class StackUsingLinkedList {
    public class Node{
        int data;
        Node next;

        public Node(int data){
            this.data= data;
            this.next=null;
        }
    }

    Node top;
    public StackUsingLinkedList(){
        this.top = null;
    }

    public void push(int data){
        Node newNode = new Node(data);

        newNode.next = top;
        top = newNode;
    }

    public void pop(){
        if(stackEmpty()){
            System.out.println("Stcak is Empty");
            return;
        }
        top = top.next;
    }

    public void peek(){
        System.out.println(" "+ top.data);
    }

    public boolean stackEmpty(){
        return top == null;
    }
    public static void main(String[] args) {
        StackUsingLinkedList stackLL = new StackUsingLinkedList();

        stackLL.push(10);
        stackLL.push(20);
        stackLL.push(30);
        stackLL.push(40);

        stackLL.peek();

    }
}