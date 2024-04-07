package sortingalgorithms;

public class QuickSort implements SortingAlgorithms{
    int[] input;

    public QuickSort(int[] input) {
        this.input = input;
    }

    @Override
    public void sort() {
        int n = input.length;
        quickSort(input, 0, n - 1);
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
        quickSortRev(input, 0, n - 1);

    }


    private void quickSort(int[] input, int low, int high) {
        if (low < high) {
            // Partition the array into two parts using partitioning index
            int pi = partition(input, low, high);

            // Recursively sort elements before partition and after partition
            quickSort(input, low, pi - 1);
            quickSort(input, pi + 1, high);
        }
    }

    private void quickSortRev(int[] input, int low, int high) {
        if (low < high) {
            // Partition the array into two parts using partitioning index
            int pi = partitionRev(input, low, high);

            // Recursively sort elements before partition and after partition
            quickSortRev(input, low, pi - 1);
            quickSortRev(input, pi + 1, high);
        }
    }
    
    private int partition(int[] input, int low, int high){
        int pivot = input[high]; // Pivot element
        int i = low - 1; // Index of smaller element

        for (int j = low; j < high; j++) {
            // If current element is smaller than or equal to pivot
            if (input[j] <= pivot) {
                i++;
                // Swap input[i] and input[j]
                int temp = input[i];
                input[i] = input[j];
                input[j] = temp;
            }
        }

        // Swap input[i+1] and input[high] (or pivot)
        int temp = input[i+1];
        input[i+1] = input[high];
        input[high] = temp;

        return i + 1;
    }

    private int partitionRev(int[] input, int low, int high){
        int pivot = input[high]; // Pivot element
        int i = low - 1; // Index of smaller element

        for (int j = low; j < high; j++) {
            // If current element is smaller than or equal to pivot
            if (input[j] > pivot) {
                i++;
                // Swap input[i] and input[j]
                int temp = input[i];
                input[i] = input[j];
                input[j] = temp;
            }
        }

        // Swap input[i+1] and input[high] (or pivot)
        int temp = input[i+1];
        input[i+1] = input[high];
        input[high] = temp;

        return i + 1;
    }
}
