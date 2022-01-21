package level1;
import java.util.*;
public class DigitFreqInNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        int digit=sc.nextInt();
        int count=0;
        while(number>0){
            int res=number%10;
            number=number/10;
            if(res==digit){
                count++;
            }
        }
        if(count!=0) {
            System.out.println(count);
        }
        else{
            System.out.println("Digit Not found");
        }
    }
}
