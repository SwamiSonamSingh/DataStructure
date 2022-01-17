package level1;
import java.util.*;
public class InvertedNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        int inv=0;
        int pos=1;
        while(number>0){
            int digit=number%10;
            number=number/10;
            inv+=pos*Math.pow(10,digit-1);
            pos++;
        }
        System.out.println(inv);
    }
}
