package Functions;

import java.util.*;

public class BuildIn {

    public static void main(String[] args) {

        // ============= Math. (function) =================

        System.out.println(Math.sqrt(4)); //square root

        double a = Math.cbrt(27); //cube root
        System.out.println(a);
        
        System.out.println(Math.abs(-89)); //modulus value (positive)

        System.out.println(Math.PI); // pi is not the method of function math

        System.out.println(Math.floor(-7.8)); //Greatest Integer Function
        System.out.println(Math.floor(7.8)); 
        
        System.out.println(Math.ceil(-7.8)); //Lowest Integer Function
        System.out.println(Math.ceil(7.8)); 

        System.out.println(Math.min(9, 10)); //minimum of two numbers
        
        System.out.println(Math.max(9, 10)); //maximum of two numbers

        //==========question 1================

        Scanner sc = new Scanner(System.in);

        System.out.print("ENTER A NUMBER : ");

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        
        System.out.println("Greatest number : " + Math.max ( Math.max ( num1, num2 ) , num3 ) );

        sc.close();

        // ============= end ===================

        System.out.println(Math.pow(7, 2)); // power of a number 49
        System.out.println(Math.pow(0, 0)); 
        
    }
}
