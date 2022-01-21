package level1;
import java.util.*;
public class DecimalToAnyBase {
    public static int decimatobase(int n,int b){
        int res=0;
        int power=0;
        while(n>0){
            int rem=n%b;
            n=n/b;
            int multiple=(int) Math.pow(10,power);
            res=res+(rem*multiple);
            power++;
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        int base=sc.nextInt();
        int result=decimatobase(number,base);
        System.out.println(result);
    }
}
