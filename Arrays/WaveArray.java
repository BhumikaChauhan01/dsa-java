package Arrays;

public class WaveArray {
    // question :
    // input : {1,2,3,4,5} (sorted and distinct)--> must be in place.
    // output : {2,1,4,3,5}

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        for (int i = 0; i < arr.length - 1; i += 2) {
            int temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        
    }
}
