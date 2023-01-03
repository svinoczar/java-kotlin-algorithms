package sorted;

public class SortedTests {
    public static void bubbleTest (int count) {
        for (int n = 0; n < count; n++) {
            System.out.println("\tTEST #" + (n+1));
            int[] array;
            int arrLen = (int) (4 + Math.random() * 6);
            array = new int[arrLen];
            for (int i = 0; i < arrLen-1; i++) {
                array[i] = (int) (0 + Math.random() * 10);
            }
            // Вывод неотсортированного тестового массива.
            for (int i : array) {
                System.out.print(i + ", ");
            }
            System.out.println();
            // Проверка сортировки пузырьком.
            Sorted.bubbleSort(array);
            for (int i : array) {
                System.out.print(i + ", ");
            }
            System.out.println("\n");
        }
    }


    public static void selectionTest (int[] array){
        // Вывод неотсортированного тестового массива.
        for (int i : array) {
            System.out.print(i + ", ");
        }
        System.out.println();
        // Проверка сортировки выбором.
        Sorted.bubbleSort(array);
        for (int i : array) {
            System.out.print(i + ", ");
        }
        System.out.println();
    }


    public static void sortedTest(Sorted type, int count){

    }
}
