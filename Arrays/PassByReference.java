package Arrays;

public class PassByReference {
    public static void main(String[] args) {
        // concept : array point krti h uski values ko pass krne pr user function me
        // array ko vo bhi ussi value ko point krti h jiska mtlb changes same array me
        // hi hota h
        int[] x = { 1, 2, 3, 4, 5, 6, };
        System.out.println(x[2]);
        change(x);
        System.out.println(x[2]);

    }

    public static void change(int[] x) {
        x[2] = 99;

    }

}
