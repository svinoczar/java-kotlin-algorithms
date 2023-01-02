package sorted;

public class Sorted {
    int[] array;
    public Sorted(int[] array){
        this.array = array;
    }


    public static int[] bubbleSort(int[] array){
        int length = array.length;
        while (length != 0) {
            int max_index = 0;
            for (int i = 1; i < length; i++) {
                int temp = array[i - 1];
                if (array[i - 1] > array[i]) {
                    array[i - 1] = array[i];
                    array[i] = temp;
                    max_index = i;
                }
            }
            length = max_index;
        }
        return array;
    }


    public static int[] selectionSort(int[] array){
        for (int i = 0; i < array.length-1; i++){
            int min_index = i;
            for (int j = i+1; j < array.length; j++){
                if (array[min_index] > array[j]) min_index=j;
            }
            if (min_index != i){
                int temp = array[min_index];
                array[min_index] = array[i];
                array[i] = temp;
            }
        }
        return array;
    }
}
