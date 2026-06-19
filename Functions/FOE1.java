package Functions;

public class FOE1 {

    public static int sum(int a , int b) {
        int result = a + b;
        return result;
    } 

    public static void main(String[] args) {
        System.out.println(multiply(3, 15));

        for(int i = 1; i <= 10; i++){
            System.out.print(i + " ");
            
        }
        System.out.println("Hello me yha faltu me hu");
        System.out.println(multiply(5, 5));
        System.out.println(sum(4, 6));
    }
    
    public static int multiply(int c, int d) {
        int product = c * d;
        return product;
    }
}
// flow of execution : main function ke andar jo pehele hoga vo chlega 