package level1;
import java.util.*;
public class Pattern3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int line=sc.nextInt();
        for(int i=0;i<line;i++){
            for(int j=0;j<line-i;j++){
                System.out.print("  ");
            }
            for(int k=0;k<i;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}





//+ + + + *
//+ + + * *
//+ + * * *
//+ * * * *
//* * * * *
//line     space     star
//1        4         1
//2        3         2
//3         2         3
//4          1        4
//5           0       5
