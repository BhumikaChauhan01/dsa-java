package Arrays;

import java.util.*;

public class Product {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // intialization
        int[] arr = new int[6];

        // input
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        
        //output
        int prod = 1;
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] != 0){
               prod = prod * arr[i];
            }else{
                continue;
            }
            
        }
        System.out.println(prod);
        sc.close();
    }
}
