package level1;
import java.util.*;
public class DifferenceOfConsucativeCharacter {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        String str=sc.next();
        String result=str.charAt(0)+"";
        for(int i=1;i<str.length();i++){
            int diff=0;
            char current=str.charAt(i);
            char previous=str.charAt(i-1);
            diff=current-previous;
            result=result+diff+current;
//            System.out.println(diff);
        }
        System.out.println(result);
    }
}
