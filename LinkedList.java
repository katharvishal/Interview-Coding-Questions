public class LinkedList {
    public class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    Node head;

        public void addAtBegining(int data){
            Node newNode = new Node(data);
            newNode.next = head;
            head = newNode;
        }

        public void addAtEnd(int data){
            Node newNode = new Node(data);
            Node current = head;

            if(head == null){
                head = newNode;
            }

            while(current.next != null){
                current = current.next;
            }
            current.next = newNode;
    
        }

        public void deleteAtfirst(){
            Node current = head;
            current = current.next;
            head = current;
        }

        public void deleteAtEnd(){
            Node current = head;
            
            if(current == null){
                return;
            }

            while(current.next.next != null){  //this loop is stop before one node
                current = current.next;
            }
            current.next = null;
            
        }

        public void addAtanyposition(int data ,int index){
            Node newNode = new Node(data);
            Node current = head;

            for(int i =0; i<index-1; i++){
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;
        }

        public void display(){
            Node current = head;

            while(current != null){
                System.out.print(current.data + "->");
                current = current.next;
            }
            System.out.print("Null");
        }
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.addAtBegining(5);
        list.addAtBegining(10);
        list.addAtBegining(20);
        list.addAtBegining(30);
        list.addAtEnd(2);
        list.deleteAtfirst();
        list.deleteAtEnd();
        list.addAtanyposition(15, 2);

        list.display();
    }
}
