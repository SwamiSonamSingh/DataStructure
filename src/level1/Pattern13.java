package level1;
import java.util.*;
public class Pattern13 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int line=sc.nextInt();
        int a=0;
        int b=1;
        int c;
        for(int i=1;i<=line;i++){
            for(int j=1;j<=i;j++){
                c=a+b;
                System.out.print(a+" ");
                a=b;
                b=c;
            }
            System.out.println();
        }
    }
}
