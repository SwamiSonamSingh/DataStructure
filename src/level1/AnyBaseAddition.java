package level1;
import java.util.*;
public class AnyBaseAddition {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int base=sc.nextInt();
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int power=0;
        int result=0;
        int carry=0;
        while(num1 >0 || num2>0 || carry>0){
            int rem1=num1%10;
            int rem2=num2%10;
            int digitResult=rem1+rem2+carry;
            carry=digitResult/base;
            digitResult=digitResult%base;
            int powerResult=(int) Math.pow(10,power);
            result=result+(powerResult*digitResult);
            num1=num1/10;
            num2=num2/10;
            power++;
        }
        System.out.println(result);
    }
}
