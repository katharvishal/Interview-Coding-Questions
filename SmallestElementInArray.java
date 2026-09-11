public class SmallestElementInArray {
    public static void main(String[] args) {
        int[] array = {10, 7, 40, 15, 30};

        int smallest = array[0];

        for(int i = 1; i < array.length; i++){
            if(array[i] < smallest){
                smallest = array[i];
            }
        }
        System.out.println("Smallest is : " + smallest);
    }
}
