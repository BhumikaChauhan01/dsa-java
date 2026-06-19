package Patterns;
import java.util.*;

public class ProdNonZero {
    public static void main(String[] args) {
        
        @SuppressWarnings("resource")
        
        Scanner sc = new Scanner(System.in);
        System.out.print("NUMBER:");
        int n = sc.nextInt();
        int prod = 1;
        while (n != 0) {

            int lastDigit = n % 10; // last digit
            if (lastDigit != 0) {
                prod *= lastDigit; // pord me multiply hui last digit
            }

            n /= 10; // number se last digit hatt gyi
        }
        System.out.println(prod);
    }
}
