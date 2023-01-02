import sorted.Sorted;
import sorted.SortedTests;

public class Main {
    public static void main(String[] args) {
        int[] arr1 = {9,8,7,6,5,4,3,2,1};
        int[] arr2 = {11,12,10,13,9,14,8,15,7};
        int[] arr3 = {5,5,4,4,3,3,2,2,1,0};
        int[] arr4 = {1,2,3,4,5,4,3,2,1};
        int[] arr5 = {0,0,0,0,7,8,9};

        // bubbleSort tests 1-5
        SortedTests.bubbleTest(arr1);
        SortedTests.bubbleTest(arr2);
        SortedTests.bubbleTest(arr3);
        SortedTests.bubbleTest(arr4);
        SortedTests.bubbleTest(arr5);
    }
}