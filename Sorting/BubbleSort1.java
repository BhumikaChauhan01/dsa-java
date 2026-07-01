package Sorting;

public class BubbleSort1 {

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
        for (int i = 0; i < n - 1; i++) { // n-1 passes
            for (int j = 0; j < n - 1 - i; j++) { // i pr depend hua j
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

// conclusions:

// 1 --> 100 log ki height alg h unko sort krenge to 99 logo ko lgate lgate last
// vala to apni jagah aa hi jayega iska mtlb (n) ko sort krne ke liye (n-1)
// passes lgenge.

// 2 --> j < n - 1 - i; kyuki piche se sort hota ja rha h to dubara check krne
// se operations bhadengi isliye koi fayeda nhi h isliye har pass me i times
// minus ho jayengi operations { n-1, n-2, n-3, n-4 _ _ _ _ 1 } = t.n.o =
// n(n-1)/2

// 3 --> time complexity : O(n^2) big O of n square