package level1;
import java.util.*;
public class Pattern5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int line=sc.nextInt();
        for(int i=1;i<=line;i++){
            for(int j=1;j<=line+1-i;j++){
                System.out.print("* ");
            }
            for(int k=1;k<=i-1;k++){
                System.out.print("  ");
            }
            System.out.println();
        }
    }
}
