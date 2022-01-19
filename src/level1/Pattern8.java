package level1;
import java.util.*;
public class Pattern8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int line=sc.nextInt();
        for(int i=1;i<=line;i++){
            for(int j=1;j<=line+1-i;j++){
                System.out.print("* ");
            }
            for(int k=1;k<=2*i;k++){
                System.out.print("  ");
            }
            for(int l=1;l<=line+1-i;l++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=1;i<line;i++){
            for(int j=1;j<=i+1;j++){
                System.out.print("* ");
            }
            for(int k=1;k<=((line*2)-(2*i));k++){
                System.out.print("  ");
            }
            for(int l=1;l<=i+1;l++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
