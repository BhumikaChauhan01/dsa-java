package Arrays;

public class SecondLargest {

    public static void main(String[] args) {
        int[] arr = { 2, 4, 5, 7, 8, 9 };
        int max = Integer.MIN_VALUE;
        int SecondMax = Integer.MIN_VALUE;

        // calculate max

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];

            }
        }

        // calculate SecondMax

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > SecondMax && arr[i] != max) {
                SecondMax = arr[i];

            }
        }

        System.out.println(max);
        System.out.println(SecondMax);

    }
}
