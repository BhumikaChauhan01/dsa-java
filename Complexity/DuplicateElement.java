package Complexity;

public class DuplicateElement {
     public static void main(String[] args) {

        //approach 1 ----> too much time taken because of number of operations is more
        int[] arr = {1,2,2,3,6};
        for(int i = 0 ; i < arr.length ; i++){
            for(int j = i + 1 ; j < arr.length ; j++){
                if(arr[i] == arr[j]){
                    System.out.println("duplicate number : " + arr[i]);
                }
            }
        }
    }
}
