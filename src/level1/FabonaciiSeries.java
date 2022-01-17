package level1;
import java.util.*;
public class FabonaciiSeries{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number of Terms : ");
        int term= sc.nextInt();
        int a=0,b=1,c;
        System.out.print(a+" "+b+" ");
        for(int i=2;i<term;i++){
            c=a+b;
            System.out.print(c+" ");
            a=b;
            b=c;
        }
    }
}
