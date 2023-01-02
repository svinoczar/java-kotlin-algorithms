package sorted;

public class SortedTests {


    public static void bubbleTest (int[] array){
        System.out.println("\n---------------------------------------");
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
        System.out.println("\n---------------------------------------");
    }
}
