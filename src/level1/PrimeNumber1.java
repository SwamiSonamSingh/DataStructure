package level1;
import java.util.*;
public class PrimeNumber1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Last boundary : ");
        int number= sc.nextInt();
        for(int i=1;i<=number;i++){
            int count=0;
            for(int j=1;j<=i;j++){
                if(i%j==0){
                    count++;
                }
            }
            if(count==2){
                System.out.println(i);
            }
        }
    }
}
