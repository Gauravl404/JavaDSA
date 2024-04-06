package sortingalgorithms;

public class MergeSort implements SortingAlgorithms {

    private int[] input;

    public MergeSort(int[] input) {
        this.input = input;
    }

    @Override
    public void sort() {
        this.mergeSort(input, 0, input.length - 1);
    }

    private void mergeSort(int[] input, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(input, left, mid);
            mergeSort(input, mid + 1, right);
            merge(input, left, mid, right);
        }
    }

    private void mergeSortRev(int[] input, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSortRev(input, left, mid);
            mergeSortRev(input, mid + 1, right);
            mergeRev(input, left, mid, right);
        }
    }

    private void merge(int[] input, int left, int mid, int right) {

        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] L = new int[n1];
        int[] R = new int[n2];

        for (int i = 0; i < n1; i++) {
            L[i] = input[left + i];
        }

        for (int i = 0; i < n2; i++) {
            R[i] = input[mid + 1 + i];
        }

        int i = 0, j = 0;
        int k = left;

        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                input[k] = L[i];
                i++;
            } else {
                input[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            input[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            input[k] = R[j];
            j++;
            k++;
        }


    }

    private void mergeRev(int[] input, int left, int mid, int right) {

        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] L = new int[n1];
        int[] R = new int[n2];

        for (int i = 0; i < n1; i++) {
            L[i] = input[left + i];
        }

        for (int i = 0; i < n2; i++) {
            R[i] = input[mid + 1 + i];
        }

        int i = 0, j = 0;
        int k = left;

        while (i < n1 && j < n2) {
            if (L[i] > R[j]) {
                input[k] = L[i];
                i++;
            } else {
                input[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            input[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            input[k] = R[j];
            j++;
            k++;
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
        mergeSortRev(input,0,input.length-1);
    }
}
