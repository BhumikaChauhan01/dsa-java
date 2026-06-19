package Arrays;

public class MaxElement {
    public static void main(String[] args) {
        int[] arr = {4, 6, 8, 9 , 1 ,2};
        int max = arr[0];
        int n = arr.length;
        for(int i = 1; i < n ; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("the max element :" + max);
    }
}
