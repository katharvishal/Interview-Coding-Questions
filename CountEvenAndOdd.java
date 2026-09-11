public class CountEvenAndOdd {

    public static int countEven(int[] array){
        int count = 0;
        for(int i =0; i < array.length; i++){
            if(array[i]%2==0){
                count++;
            }
        }
        return count;
    }


    public static int countOdd(int[] array){
        int count = 0;
        for(int i =0; i < array.length; i++){
            if(array[i]%2!=0){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] array = {2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println("NO. of Even are : " + countEven(array));
        System.out.println("NO. of Even are : " + countOdd(array));
    }
}
