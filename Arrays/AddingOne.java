package Arrays;

import java.util.Collections;
import java.util.Vector;

public class AddingOne {
    public static void main(String[] args) {
        int[] arr = { 9, 9, 9 };
        // int[] arr = { 6, 9, 9 };
        Vector<Integer> ans = addone(arr);
        System.out.println(ans);
    }

    public static Vector<Integer> addone(int[] arr) {
        Vector<Integer> ans = new Vector<>();
        int n = arr.length - 1;
        int carry = 1;
        for (int i = n; i >= 0; i--) {
            if (arr[i] + carry <= 9) {
                ans.add(arr[i] + carry);
                carry = 0;
            } else {
                ans.add(0);
                carry = 1;
            }

        }
        if (carry == 1) {
            ans.add(1);
        }
        Collections.reverse(ans);
        return ans;
    }

}
