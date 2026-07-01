package Arrays;

import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;

public class AddingArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length of first array: ");
        int lengthOne = sc.nextInt();

        System.out.print("Enter the length of second array: ");
        int lengthTwo = sc.nextInt();

        int[] arr1 = new int[lengthOne];
        int[] arr2 = new int[lengthTwo];

        System.out.println("Input first array digits:");
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.println("Input second array digits:");
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = sc.nextInt();
        }

        ArrayList<Integer> ans = AddArrayList(arr1, arr2);
        System.out.println(ans);

        sc.close();
    }

    public static ArrayList<Integer> AddArrayList(int[] arr1, int[] arr2) {
        ArrayList<Integer> ans = new ArrayList<>();

        int i = arr1.length - 1;
        int j = arr2.length - 1;
        int carry = 0;

        while (i >= 0 || j >= 0 || carry > 0) {
            int sum = carry;

            if (i >= 0) {
                sum += arr1[i];
                i--;
            }

            if (j >= 0) {
                sum += arr2[j];
                j--;
            }

            ans.add(sum % 10);
            carry = sum / 10;
        }

        Collections.reverse(ans);
        return ans;
    }
}