public class ReverseArray {

    public void revers(int[] array){
        int last = array.length - 1;

        for(int i = 0; i < array.length; i++){
            int temp = array[i];
            array[i] = array[last];
            array[last] = temp;

            last--;
        }

        for(int i = 0; i < array.length; i++){
            System.out.println("" + array[i]);
        }
    }
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4};

    }
}
