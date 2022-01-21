package level1;
import java.util.*;
public class AnyBaseToDecimal {
    public static int basetoDecimal(int i,int b){
        int res=0;
        int power=0;
        while(i>0){
            int rem=i%10;
            i=i/10;
            int powerres=(int) Math.pow(b,power);
            res=res+(rem*powerres);
            power++;
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int input=sc.nextInt();
        int base=sc.nextInt();
        int result=basetoDecimal(input,base);
        System.out.println(result);
    }
}
