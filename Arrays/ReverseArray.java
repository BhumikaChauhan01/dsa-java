package Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = { 1, 5, 6, 9, 0, 4, 62, 64 };
        int n = arr.length;
        // 2 variable/pointer technique
        int i = 0 ;
        int j = n-1;
        
        while(i < j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        for( int element : arr) System.out.print(element + " ");

        // reverse a part or subarray of a given array
        // int i = 2 ; int j = 5;
    }
}
