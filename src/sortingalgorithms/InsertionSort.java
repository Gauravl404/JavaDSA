package sortingalgorithms;

public class InsertionSort implements SortingAlgorithms{

    int[] input;

    public InsertionSort(int[] input) {
        this.input = input;
    }

    @Override
    public void sort() {
        int n = input.length;

        for (int i = 1; i < n; i++) {

            int key = input[i];
            int j = i - 1;

            while (j>=0 && input[j]>key){
                input[j+1] = input[j];
                j = j-1;
            }

            input[j+1] = key;

        }

    }

    @Override
    public void printArray(String time) {
        System.out.println("");
        System.out.print("Array "+time+" sorting :");
        for (int ele : input){
            System.out.print(ele+",");
        }
    }

    @Override
    public void reverseSort() {
        int n = input.length;

        for (int i = 1; i < n; i++) {

            int key = input[i];
            int j = i - 1;

            while (j>=0 && input[j]<key){
                input[j+1] = input[j];
                j = j-1;
            }

            input[j+1] = key;

        }
    }
}
