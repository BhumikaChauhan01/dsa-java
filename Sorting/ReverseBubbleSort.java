package Sorting;

public class ReverseBubbleSort {
    public static void print(int[] arr) {

        for (int element : arr) {
            System.out.print(element + " ");

        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = { 2, 6, 12, 2, 1, 8, 88, 22, 0, 43 };
        print(arr);
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int swaps = 0;

            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swaps++;
                }
            }

            if (swaps == 0) break ;
        }
        print(arr);
    }
}
