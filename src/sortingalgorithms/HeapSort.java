package sortingalgorithms;

public class HeapSort implements SortingAlgorithms{
    private int[] input;

    public HeapSort(int[] input) {
        this.input = input;
    }

    @Override
    public void sort() {
        int n = input.length;

        // Build heap (rearrange array)
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(input, n, i);
        }

        // One by one extract an element from heap
        for (int i = n - 1; i >= 0; i--) {
            // Move current root to end
            int temp = input[0];
            input[0] = input[i];
            input[i] = temp;

            // Call max heapify on the reduced heap
            heapify(input, i, 0);
        }
    }

    @Override
    public void printArray(String time) {
        System.out.println("");
        System.out.print("Array " + time + " sorting :");
        for (int ele : input) {
            System.out.print(ele + ",");
        }
    }

    @Override
    public void reverseSort() {
        int n = input.length;

        // Build heap (rearrange array)
        for (int i = n / 2 - 1; i >= 0; i--) {
            minHeapify(input, n, i);
        }

        // One by one extract an element from heap
        for (int i = n - 1; i >= 0; i--) {
            // Move current root to end
            int temp = input[0];
            input[0] = input[i];
            input[i] = temp;

            // Call min heapify on the reduced heap
            minHeapify(input, i, 0);
        }
    }


    // To heapify a subtree rooted with node i which is an index in arr[]
    public  void heapify(int[] input, int n, int i) {
        int largest = i; // Initialize largest as root
        int leftChild = 2 * i + 1; // Left child index
        int rightChild = 2 * i + 2; // Right child index

        // If left child is larger than root
        if (leftChild < n && input[leftChild] > input[largest]) {
            largest = leftChild;
        }

        // If right child is larger than largest so far
        if (rightChild < n && input[rightChild] > input[largest]) {
            largest = rightChild;
        }

        // If largest is not root
        if (largest != i) {
            int temp = input[i];
            input[i] = input[largest];
            input[largest] = temp;

            // Recursively heapify the affected sub-tree
            heapify(input, n, largest);
        }
    }

    public  void minHeapify(int[] input, int n, int i) {
        int minimum = i; // Initialize largest as root
        int leftChild = 2 * i + 1; // Left child index
        int rightChild = 2 * i + 2; // Right child index

        // If left child is larger than root
        if (leftChild < n && input[leftChild] <= input[minimum]) {
            minimum = leftChild;
        }

        // If right child is larger than largest so far
        if (rightChild < n && input[rightChild] <= input[minimum]) {
            minimum = rightChild;
        }

        // If largest is not root
        if (minimum != i) {
            int temp = input[i];
            input[i] = input[minimum];
            input[minimum] = temp;

            // Recursively heapify the affected sub-tree
            minHeapify(input, n, minimum);
        }
    }
}
