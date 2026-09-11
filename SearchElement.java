public class SearchElement {

    public static int search(int[] array, int key){
        int n = array.length;
        for(int i=0; i<n; i++){
            if(array[i] == key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6};

        int key = 5;
        search(array, key);

    }
}
