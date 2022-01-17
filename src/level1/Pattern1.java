package level1;
import java.util.*;
//printing Z pattern
public class Pattern1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        for(int i=0;i<num;i++){
            System.out.print("* ");
        }
        System.out.println();
        for(int i=1;i<num-1;i++) {
            for (int j = 1; j < num - i; j++) {
                System.out.print("  ");
            }
            System.out.print("*\n");
        }
        for(int i=0;i<num;i++){
            System.out.print("* ");
        }
    }
}
