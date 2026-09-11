public class SumAndAvgInArray {

    public static int arraySum(int[] array){
        int sum = 0;
        for(int i = 0; i<array.length; i++){
            sum += array[i];
            
        }
        return sum;

    }

    public static double arrayAvg(int[] array){
        int sum = 0;
        for(int i = 0; i<array.length; i++){
            sum += array[i];
        }
        double Avg = sum/array.length;
        return Avg;
        
    }
    public static void main(String[] args) {
        int[] array = {10, 7, 40, 15, 30};

        System.out.println("Array Sum is : " + arraySum(array));
        System.out.println("Array avg is : " + arrayAvg(array));

    }
}
