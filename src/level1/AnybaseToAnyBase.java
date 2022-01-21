package level1;
import java.util.*;
public class AnybaseToAnyBase {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int input=sc.nextInt();
        int base1=sc.nextInt();
        int base2=sc.nextInt();
        int decimalNumber=0;
        int result=0;
        int power=0;
        int power1=0;
        while(input>0){
            int rem=input%10;
            input=input/10;
            int powerres=(int) Math.pow(base1,power);
            decimalNumber=decimalNumber+(rem*powerres);
            power++;
        }
        while(decimalNumber>0){
            int rem=decimalNumber%base2;
            decimalNumber=decimalNumber/base2;
            int powerres1=(int) Math.pow(10,power1);
            result=result+(rem*powerres1);
            power1++;
        }
        System.out.println(result);
    }
}
