package Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = { 2, 9, 7, -1, 8, 3 };
        int target = 2;

        for(int i = 0; i < arr.length ; i++){
            for(int j = i + 1; j < arr.length; j++ ){
                if(arr[i] + arr[j] == target){
                    System.out.println("Indices: " + i + " " + j);
                }
            }
            
        }
       
    }
}
