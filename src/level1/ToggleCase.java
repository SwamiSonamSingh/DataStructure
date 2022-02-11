package level1;
import java.util.*;
public class ToggleCase {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        String result="";
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
//            System.out.println(ch);
            if(ch>='A' && ch<='Z' ){
//                System.out.println(ch);
                ch=Character.toLowerCase(ch);
                result=result+ch;
            }
            else if(ch>='a' && ch<='z'){
//                System.out.println(ch);
                ch=Character.toUpperCase(ch);
                result=result+ch;
            }
        }
        System.out.println(result);
    }
}
