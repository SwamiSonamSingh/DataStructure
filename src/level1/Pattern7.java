package level1;
import java.util.*;
public class Pattern7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int line=sc.nextInt();
        for(int i=1;i<=line;i++){
            for(int j=1;j<=line-i;j++){
                System.out.print("  ");
            }
            for(int k=1;k<=2*i-1;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=1;i<=line;i++){
            for(int j=1;j<=i;j++){
                System.out.print("  ");
            }
            for(int k=1;k<=(line*2-1)-(2*i);k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
