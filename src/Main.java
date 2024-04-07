import sortingalgorithms.*;

public class Main {
    public static void main(String[] args) {

        int[] unsortedArray = {7, 15, 23, 9, 42, 18, 31, 5, 12, 27};

        SortingAlgorithms sortingAlgorithms = new QuickSort(unsortedArray);

        sortingAlgorithms.printArray("before");
        sortingAlgorithms.sort();
        sortingAlgorithms.printArray("after");
        sortingAlgorithms.reverseSort();
        sortingAlgorithms.printArray("after reverse");
    }
}