package Sorting;

public class SelectionSort {
    public static void print(int[] arr) {
        for(int element : arr){
            System.out.print(element + " ");
        }
        System.out.println();
        
    }

    public static void main(String[] args) {
        int[] arr = {9,0,-6,-3,8,4,2,-1,1,0,11,-90};
        int n = arr.length;
        
        print(arr);
        for(int i = 0 ; i < n-1 ; i++){
            int min = Integer.MAX_VALUE;
            int mindx = -1;

            for(int j = i ; j < n ; j++){
                //finding minimum
                if(arr[j] < min){
                    min = arr[j];
                    mindx = j;
                }
                //swap
                int temp = arr[i];
                arr[i] = arr[mindx];
                arr[mindx] = temp;
            }
            
        }
        print(arr);
    }
}

// time complexity --> 
// pass 1 -> n times
// pass 2 -> n-1 times
// pass 3 -> n-2 times
// pass 4 -> n-3 times

// t.n.o = n + (n-1) + (n-2) + (n-3) + ..... + 1 = n(n-1)/2  ==> O(n^2)
// best , avg , worst => O(n^2)