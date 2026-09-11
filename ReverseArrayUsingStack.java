import java.util.Stack;

public class ReverseArrayUsingStack {

    public void reverse(int[] array){
        Stack<Integer> stack = new Stack<>();

        for(int element : array){
            stack.push(element);
        }

        for(int i = 0; i< array.length; i++){
            array[i] = stack.pop();
        }

    }

    public void displayReverse(int[] array){
        for (int element : array) {
            System.out.print(element + " ");
        }
    }
    public static void main(String[] args) {
        int[] array = {2, 4, 5, 6, 8, 9};

        ReverseArrayUsingStack reverser = new ReverseArrayUsingStack();

        reverser.reverse(array);

        reverser.displayReverse(array);
        
    }
}
