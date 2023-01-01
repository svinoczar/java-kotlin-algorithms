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

}
