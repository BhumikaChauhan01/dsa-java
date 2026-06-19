package Loops;
import java.util.*;

public class Continue {
    public static void main(String[] args) {
        @SuppressWarnings("resource")

        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("ENTER A NUM:");
            int n = sc.nextInt();
            if (n % 10 == 0) {
                continue;

            }
            System.out.println("PRINTED NUM:" + n);
        } while (true);

        
    }
}
