public class ReverseLL {
    public class Node {
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    Node head;

    public void add(int data){
        Node newNode = new Node(data);

        newNode.next = head;
        head = newNode;
    }
    public void reverse(){
        Node current = head;
        Node prev = null;

        while(current!=null){
            Node newNode = current.next;
            current.next = prev;
            prev = current;
            current= newNode;
        }

        while(prev!=null){
            System.out.println(prev.data+" ->");
            prev = prev.next;
        }
        System.out.print("Null");
    }
    public static void main(String[] args) {

        ReverseLL list = new ReverseLL();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        list.reverse();
    }
}
