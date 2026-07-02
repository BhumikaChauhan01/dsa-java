package Sorting;

public class MoveZerosEnd {

     public static void print(int[] arr) {
        for (int element : arr) {
            System.out.print(element + " ");

        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {6,8,0,2,9,0,0,1,4,5,6,8,9,0};
        int j = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

            j++;
            
            }
        }
        print(arr);
    }
}
