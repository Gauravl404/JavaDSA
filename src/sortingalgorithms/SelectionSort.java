package sortingalgorithms;

public class SelectionSort implements SortingAlgorithms {

    int[] input;

    public SelectionSort(int[] input) {
        this.input = input;
    }

    @Override
    public void sort() {

        int n = input.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            for (int j = i; j < n; j++) {
                if (input[j] < input[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = input[i];
            input[i] = input[minIndex];
            input[minIndex] = temp;

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

        for (int i = 0; i < n - 1; i++) {
            int maxIndex = i;

            for (int j = i; j < n; j++) {
                if (input[j] > input[maxIndex]) {
                    maxIndex = j;
                }
            }
            int temp = input[i];
            input[i] = input[maxIndex];
            input[maxIndex] = temp;

        }
    }
}
