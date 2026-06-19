package Arrays;

import java.util.*;

public class ArrayBasics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //indexing 0,1,2,3,4,5
        int[] x = {1,2,3,4,5,6}; //intialization

        System.out.println(x[0] + x[1]); //access + operation

        x[5] = 9;//updation (array is mutable)
        System.out.println(x[5]);

        int[] arr = new int[6]; //index will be 0 10 5 (intialization)
        
        //input
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        //output
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }

        sc.close();
       
    }
}
