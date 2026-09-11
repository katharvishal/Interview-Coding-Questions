public class MergeTwoArray {

    private int[] merge;

    public void merge(int[] array1, int[] array2){
        merge = new int[array1.length + array2.length];

        for(int i=0; i<array1.length; i++){
            merge[i] = array1[i];
        }

        for(int i= 0; i< array2.length; i++){
            merge[array1.length+i] = array2[i];
        }
    }

    public void display(){

        for(int i = 0; i< merge.length; i++){
            System.out.print(" " +merge[i]);
        }
    }
    public static void main(String[] args) {
        int[] array1 = {10, 8, 5, 5, 20};
        int[] array2 = {1, 2, 3, 4, 5};


        MergeTwoArray merger = new MergeTwoArray();
        merger.merge(array1, array2);
        merger.display();
    }
}
