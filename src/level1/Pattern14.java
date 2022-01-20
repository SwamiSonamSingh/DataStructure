package level1;
import java.util.*;
public class Pattern14 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int line=sc.nextInt();
        for(int i=0;i<=line;i++){
            int num=1;
            for(int j=0;j<=i;j++){
                System.out.print(num+" ");
                int flag=(num*(i-j))/(j+1);
                num=flag;
            }
            System.out.println();
        }
    }
}
