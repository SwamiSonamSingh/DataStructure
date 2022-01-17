package level1;
import java.util.*;
public class NumberOfDigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number : ");
        int number=sc.nextInt();
        int rev=0;
        int count=0;
        while(number>0){
            int rem=number%10;
            rev=rem+rev*10;
            System.out.print(rem+" ");
            number=number/10;
            count++;
        }
        System.out.println("\n"+count);
    }
}
