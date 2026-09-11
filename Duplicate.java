public class Duplicate {

    public void duplicateElements(int[] array){
        for(int i = 0; i < array.length; i++){
            for(int j=i+1; j<array.length; j++){
                if(array[i] == array[j]){
                    System.out.println("Duplicate Element is: "+ array[i]); 
                }
            }
        }
        
    }
    public static void main(String[] args) {
        int[] array = {10, 8, 5, 5, 20};
    }
}
