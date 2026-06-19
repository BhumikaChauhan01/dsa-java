package Loops;

public class evenSum {
    public static void main(String[] args) {
        int[] set = { 2, 4, 5, 6, 7, 8, 9, 0, 10, 3 };
        int evenSum = 0;
        int oddSum = 0;
        for (int i = 0; i < set.length; i++) {
            if (set[i] % 2 == 0) {
                evenSum += set[i];
            } else {
                oddSum += set[i];
            }
        }
        System.out.println("even sum:" + evenSum);
        System.out.println("odd sum:" + oddSum);
    }
}
