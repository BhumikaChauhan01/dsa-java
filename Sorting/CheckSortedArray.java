package Sorting;

public class CheckSortedArray {
    public static void main(String[] args) {
        int[] arr = { 16, 90, 4, 2 };
        boolean result = Sorted(arr);
        System.out.println(result);

    }

    public static boolean Sorted(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1])
                return false;
        }
        return true;
    }
}
