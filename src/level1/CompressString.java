package level1;
import java.util.*;
public class CompressString {
    public static void uniqueCharater(String s){
        char ch=s.charAt(0);
        String result=ch+"";
        for(int i=1;i<s.length();i++){
            char current=s.charAt(i);
            char previous=s.charAt(i-1);
            if(current!=previous){
                result=result+current;
            }
        }
        System.out.println(result);
    }
    public static void compressionString(String s){
        char ch=s.charAt(0);
        String result=ch+"";
        int count=1;
        for(int i=1;i<s.length();i++){
            char current=s.charAt(i);
            char previous=s.charAt(i-1);
            if(current==previous){
                count++;
            }
            else if(current!=previous){
               if(count>1){
                   result=result+count;
                   count=1;
               }
               result=result+current;
            }
        }
        if(count>1){
            result=result+count;
            count=1;
        }
        System.out.println(result);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        uniqueCharater(str);
        compressionString(str);
    }
}
