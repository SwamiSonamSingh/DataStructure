package level1;
import java.util.*;
public class Pattern4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int line=sc.nextInt();
        for(int i=0;i<line;i++){
            for(int j=0;j<line-i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}