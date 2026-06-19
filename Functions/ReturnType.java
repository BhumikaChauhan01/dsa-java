package Functions;

public class ReturnType {

    public static int gansta (int a){
        System.out.println("CJ");
        // return 7;      // function ki value h 
        // return 6; // kyuki return 7 pr code ktm ho gya
        if(a < 10){ 
            return 5;
        }else{
            return 4;
        }

    }

    public static boolean GreatestNumber (int number){
        return number > 100;
    }

    public static int Number (int number){
        return number;
    }

    public static void main(String[] args) {
        gansta(4); //func ka kaam ata h //(stand alone calling)
        System.out.println(gansta(4)); // func ka kaam + func ki value ati h
        int z = gansta(4); // 7 (storing)
        System.out.println(2 + z); // 9 
    
        GreatestNumber(500); //func ne kaam kra h shant beth gya //(stand alone calling)
        System.out.println(GreatestNumber(500)); //kaam krke print bhi krwai value
        
        System.out.println(Number(9));
    }
}
