package level1;
import java.util.*;
public class RotateNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        int storage=number;
        int digit=0;
        int result=0;
        int rotation=sc.nextInt();
        while(number>0){
            number=number/10;
            digit++;
        }
        if(rotation>digit){
            rotation=rotation-digit;
        }
        else if(rotation<0){
            rotation=digit+rotation;
        }
        double divisor=Math.pow(10,rotation);
        int div=(int) divisor;
        double frontMulti=Math.pow(10,digit-rotation);
        int frontMul=(int) frontMulti;
        int front=storage%div;
        int back=storage/div;
        result=front*frontMul+back;
        System.out.println(result);
    }
}
