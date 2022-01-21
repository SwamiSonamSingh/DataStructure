package level1;
import java.util.*;
public class FunctionEx {
    public static int factorial(int x){
        int res=1;
        for(int i=1;i<=x;i++){
            res=res*i;
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int r=sc.nextInt();
        int nres=factorial(n);
        int pres=factorial(n-r);
        int res1=nres/pres;
        System.out.println(res1);
    }
}
