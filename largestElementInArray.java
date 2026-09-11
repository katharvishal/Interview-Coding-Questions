public class largestElementInArray {

    public static void main(String[] args) {
       int[] array = {10, 7, 40, 15, 30};

       int largest = array[0];

       for(int i = 1; i < array.length; i++){
        if(array[i] > largest){
            largest = array[i];
        }
       }
       System.out.println("largest is " + largest);
    }
    
}
