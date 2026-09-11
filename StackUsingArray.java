public class StackUsingArray {
    private int top;
    private int size;
    private int[] stackarray;

    public StackUsingArray(int size){
        this.size = size;
        this.stackarray = new int[size];
        this.top = -1;
    }

    public void push(int data){
        if(stackFull()){
            System.out.println("Satck is full");
            return;
        }
        stackarray[++top] = data;
    }

    public void pop(){
        if(stackEmpty()){
            System.out.println("Stack is Empty");
            return;
        }
        top--;
    }

    public boolean stackFull(){
        return top == size-1;
    }

    public boolean  stackEmpty(){
        return top == -1;
    }

    public static void main(String[] args) {
        StackUsingArray stackarray = new StackUsingArray(5);
        
    }
}
