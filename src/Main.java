import sortingalgorithms.BubbleSort;
import sortingalgorithms.MergeSort;
import sortingalgorithms.SelectionSort;
import sortingalgorithms.SortingAlgorithms;

public class Main {
    public static void main(String[] args) {

        int[] unsortedArray = {7, 15, 23, 9, 42, 18, 31, 5, 12, 27};

        SortingAlgorithms sortingAlgorithms = new MergeSort(unsortedArray);

        sortingAlgorithms.printArray("before");
        sortingAlgorithms.sort();
        sortingAlgorithms.printArray("after");
        sortingAlgorithms.reverseSort();
        sortingAlgorithms.printArray("after reverse");
    }
}