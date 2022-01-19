package level1;
import java.util.*;
public class BenjiumBulb {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i*i<=n;i++){
            System.out.println(i*i);
        }
    }
}
