package Sorting;

public class BubbleSort2 {
    // todha better pehele vale se

    public static void print(int[] arr) {
        for (int element : arr) {
            System.out.print(element + " ");

        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = { 2, 6, 12, 2, 1, 8, 88, 22, 0, 43 };
        print(arr);
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            boolean isSorted = true;
            for (int j = 0; j < n - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    isSorted = false;
                    break;
                }
            }

            if (isSorted == true) {
                break;
            }

            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }

        }
        print(arr);
        
    }
}

// conclusion :
// 1 --> hum har pass se pehele check krenge puri array vo sorted to nhi h agr sorted h to break ho jayega nhi h to bubble sort ka ek paas chlega fir dubara check hogi and so on....
