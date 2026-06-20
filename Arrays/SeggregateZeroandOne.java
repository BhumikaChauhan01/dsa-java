package Arrays;

public class SeggregateZeroandOne {
    public static void main(String[] args) {
        // 2 pass solution --> traversing the array 2 times
        int[] arr = { 1, 0, 1, 1, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1 };
        // int NumberOfZeros = 0;
        // for(int element : arr){
        // if(element == 0){
        // NumberOfZeros ++;
        // }
        // }
        // for(int i = 0; i < NumberOfZeros ; i++){
        // arr[i] = 0;
        // }
        // for(int i = NumberOfZeros; i < arr.length ; i++){
        // arr[i] = 1;
        // }
        // // for output
        // for(int i = 0; i < arr.length ; i++){
        // System.out.print(arr[i]);
        // }

        // 2 pointer technique
        // test cases : {1,0,1,0,1,0,0}
        int n = arr.length;
        int i = 0;
        int j = n - 1;

        while (i < j) {
            if (arr[i] == 0)
                i++;
            else if (arr[j] == 1)
                j--;
            else if (arr[i] == 1 && arr[j] == 0) {
                arr[i] = 0;
                arr[j] = 1;
                i++;
                j--;
            }
        }
        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k]);
        }

    }
}
