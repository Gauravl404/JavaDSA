import sortingalgorithms.BubbleSort;
import sortingalgorithms.SortingAlgorithms;

public class Main {
    public static void main(String[] args) {

        int[] unsortedArray = {7, 15, 23, 9, 42, 18, 31, 5, 12, 27};

        SortingAlgorithms bubbleSort = new BubbleSort(unsortedArray);
        bubbleSort.printArray("before");
        bubbleSort.sort();
        bubbleSort.printArray("after");
        bubbleSort.reverseSort();
        bubbleSort.printArray("after reverse");
    }
}