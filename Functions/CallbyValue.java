package Functions;

import java.util.Scanner;

public class CallbyValue {
    // ==============CALL BY VALUE================
    // concept : ki java me variables ki copy banti h ek function me fir vo copies
    // pr manipulation hote h pr dubara main function me print hoga to call stack se
    // copy htt jati h aur only og value reh jati h jo ki print ho jati h
    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;

        // copy of og a and b
        System.out.println("a:" + a);
        System.out.println("b:" + b);

    }
    // =========== function 2 ===========

    public static int Update(int num){
        num = 10;
        return num;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER A VALUE:");
        int a = sc.nextInt();
        System.out.print("ENTER B VALUE:");
        int b = sc.nextInt();
        swap(a, b);

        // original value : main function me calling ke baad function ke changes
        // terminate ho jate h aur fir original values hi output me ati h
        System.out.println("og a:" + a);

        System.out.print("og b:" + b);

        sc.close();

        // ========= function 2 ==============

        int num = 6;
        System.out.println(num); // 6
        System.out.println(Update(num)); //10
        System.out.println(num); // 6
    }
}

