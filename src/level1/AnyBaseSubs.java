package level1;
import java.util.*;
public class AnyBaseSubs {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int base=sc.nextInt();
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int result=0;
        int power=0;
        int carry=0;
        while(num2>0){
            int digit1=num1%10;
            int digit2=num2%10;
            digit2=digit2+carry;
            int d=0;
            if(digit2>=digit1){
                carry=0;
                d=digit2-digit1;
            }
            else{
                carry=-1;
                d=digit2-digit1+base;
            }
            int powerResult=(int) Math.pow(10,power);
            result=result+(powerResult*d);
            num1=num1/10;
            num2=num2/10;
            power++;
        }
        System.out.println(result);
    }
}
