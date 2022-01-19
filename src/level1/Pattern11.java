package level1;
import java.util.*;
public class Pattern11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int line=sc.nextInt();
        for(int i=1;i<=line;i++){
            for(int j=1;j<=i-1;j++){
                System.out.print("  ");
            }
            for(int k=1;k==1;k++){
                System.out.print("* ");
            }
            for(int l=1;l<=((line*2-1)-(2*i));l++){
                System.out.print("  ");
            }
            for(int m=1;m<=((line*2)-(2*i));m++){
                if(m==1){
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
        for(int i=1;i<=line;i++){
            if(i>1) {
                for (int j = 1; j <= line - i; j++) {
                    System.out.print("  ");
                }
                for (int k = 1; k == 1; k++) {
                    System.out.print("* ");
                }
                for (int l = 1; l <= 2 * i - 3; l++) {
                    System.out.print("  ");
                }
                if (i > 1) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }
}
