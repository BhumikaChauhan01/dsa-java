package Functions;

public class Factorial {
    public static int factorial(int number) {
        int fact = 1;
        for (int i = 1; i <= number; i++) {
            fact = fact * i;
        }
        return fact;
    }

    
    // ========binomial coefficent optimized=========
    public static int b(int n , int r ){
        int n_fact = factorial(n);
        int r_fact = factorial(r);
        int nr_fact = factorial(n-r);

        int result =  n_fact / ( r_fact * nr_fact);
        return result;
        
    }

    // ========== main function ============
    public static void main(String[] args) {
        int f = factorial(5);
        System.out.println(f);

        // ========binomial========
        int ans = b(6,3);
        System.out.println("easy binomial :" + ans);
    }
}
