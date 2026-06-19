package Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] arr = { 2, 5, 6, 7, 8, 23, 4, 56, 2, 9, 0 };

        //output 8, 23, 4, 56, 2, 9, 0, 2, 5, 6, 7
        
        int n = arr.length;
        int d = 15;
        d %= n; //jb rotation(d) > arr.length(n) here ex, 15 > 11 --> d = 15 % 11 = 4
        reverse(arr, 0, d - 1);
        reverse(arr, d, n - 1);
        reverse(arr, 0, n - 1);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        
    }

    public static void reverse(int[] arr, int i, int j) {
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;

        }
    }
}
