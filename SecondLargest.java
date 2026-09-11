public class SecondLargest {
    public static void main(String[] args) {

        int[] arr = {10,5,20,8,5};
        int max = arr[0];
        int secondMax = Integer.MIN_VALUE;

        for(int i = 1; i < arr.length; i++){
            if(arr[i] > max){
                secondMax = max;
                max = arr[i];
            } else if(arr[i] > secondMax && arr[i] != max){
                secondMax = arr[i];
            }
        }

        if(secondMax == Integer.MIN_VALUE){
            System.out.println("There is no second largest element.");
        } else {
            System.out.println("The second largest element is: " + secondMax);
        }
        
    }
}
