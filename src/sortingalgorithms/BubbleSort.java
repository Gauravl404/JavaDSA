package sortingalgorithms;

public class BubbleSort implements SortingAlgorithms {

    private int[] input;

    public BubbleSort(int[] input) {
        this.input = input;
    }

    @Override
    public void sort() {
        int n = input.length;

        for (int i = 0; i < n - 1; i++) { // first loop for i=0 to i = n-1
            for (int j = 0; j < n - 1 - i; j++) { // second loop for i = 0 to i = n-1-i
                if (input[j] > input[j + 1]) { //swap if current element is greater than next element
                    int temp = input[j];
                    input[j] = input[j + 1];
                    input[j + 1] = temp;
                }
            }
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

        for (int i = 0; i < n - 1; i++) { // first loop for i=0 to i = n-1
            for (int j = 0; j < n - 1 - i; j++) { // second loop for i = 0 to i = n-1-i
                if (input[j] < input[j + 1]) { //swap if current element is lesser than next element
                    int temp = input[j];
                    input[j] = input[j + 1];
                    input[j + 1] = temp;
                }
            }
        }
    }
}
