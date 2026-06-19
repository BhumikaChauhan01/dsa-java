package Arrays;

public class MissingElement {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 5 };
        System.out.println(missingElement(arr));

    }

    public static int missingElement(int[] arr) {
        long n = arr.length + 1;
        long sum = n * (n + 1) / 2;

        long arraySum = 0;
        for (int ele : arr) {
            arraySum += ele;
        }

        return (int)(sum - arraySum);
    }
}

//long is used because of 10 ki power 6 ho skte h arr me ye constraints me diya h 