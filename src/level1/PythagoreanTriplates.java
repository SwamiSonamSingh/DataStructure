package level1;
import java.util.*;
public class PythagoreanTriplates {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int max=a;
        if(max<=b){
            max=b;
        }
        if(max<=c){
            max=c;
        }
        if(max==a && ((b*b)+(c*c)==(a*a))){
            System.out.println("true");
        }
        else if(max==b && ((a*a)+(c*c)==(b*b))){
            System.out.println("true");
        }
        else if(max==c && ((b*b)+(a*a)==(c*c))){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}