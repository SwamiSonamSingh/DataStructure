package level1;
import java.util.*;
public class PrimeFactorization {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        for(int i=2;i<=number;i++){
            while(number%i==0){
                number=number/i;
                System.out.println(i);
            }
        }
    }
}
