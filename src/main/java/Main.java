import sorted.Sorted;
import sorted.SortedTests;

public class Main {
    static int[] arr1 = new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1};
    static int[] arr2 = new int[]{11, 12, 10, 13, 9, 14, 8, 15, 7};
    static int[] arr3 = new int[]{5, 5, 4, 4, 3, 3, 2, 2, 1, 0};
    static int[] arr4 = new int[]{1, 2, 3, 4, 5, 4, 3, 2, 1};
    static int[] arr5 = new int[]{0, 0, 0, 0, 7, 8, 9};

    public static void main(String[] args) {



        System.out.println("\n\t\t*** START TESTS ***\n");

        // bubbleSort tests 1-5
        System.out.println("\tvvv bubbleSort tests vvv\n");
        //----------------------------
        System.out.println("\t\t\t\t#1");
        SortedTests.bubbleTest(arr1);
        System.out.println("\t\t\t\t#2");
        SortedTests.bubbleTest(arr2);
        System.out.println("\t\t\t\t#3");
        SortedTests.bubbleTest(arr3);
        System.out.println("\t\t\t\t#4");
        SortedTests.bubbleTest(arr4);
        System.out.println("\t\t\t\t#5");
        SortedTests.bubbleTest(arr5);
        System.out.println("\n---------------------------------------");
        //----------------------------

        arr1 = new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1};
        arr2 = new int[]{11, 12, 10, 13, 9, 14, 8, 15, 7};
        arr3 = new int[]{5, 5, 4, 4, 3, 3, 2, 2, 1, 0};
        arr4 = new int[]{1, 2, 3, 4, 5, 4, 3, 2, 1};
        arr5 = new int[]{0, 0, 0, 0, 7, 8, 9};

        // selectionSort tests 1-5
        System.out.println("\tvvv selectionSort tests vvv\n");
        //----------------------------
        System.out.println("\t\t\t\t#1");
        SortedTests.selectionTest(arr1);
        System.out.println("\t\t\t\t#2");
        SortedTests.selectionTest(arr2);
        System.out.println("\t\t\t\t#3");
        SortedTests.selectionTest(arr3);
        System.out.println("\t\t\t\t#4");
        SortedTests.selectionTest(arr4);
        System.out.println("\t\t\t\t#5");
        SortedTests.selectionTest(arr5);
        //----------------------------

    }
}