public class CountNumber {

    public static void count(int[] array, int target){
        int count = 0;

        for(int i=0; i<array.length; i++){
            if(array[i] == target){
                count ++;
            }
        }
        System.out.println("element "+ target+ " is occurse in array is : "+ count+" times");
    }
    public static void main(String[] args) {
        int[] array = {1, 1, 2, 3, 3, 4, 5, 6};

        int target = 1;
        count(array, target);
    }
}
