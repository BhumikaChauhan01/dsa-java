package conditional;
import java.util.*;

public class PostiveOrNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number:");
        int number = sc.nextInt();

        if(number < 0){
        System.out.println("NEGATIVE");
        }else{
        System.out.println("POSITIVE");
        }
        sc.close();
    }

}
