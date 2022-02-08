package level1;
import java.util.*;
public class PalindromeSubsting {
    public static boolean palindromeCheck(String str1){
        int start=0;
        int end=str1.length()-1;
        while(start<end){
            if(str1.charAt(start)!= str1.charAt(end)){
                return false;
            }
            else{
                start++;
                end--;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<=str.length();j++){
               String result=str.substring(i,j);
              if(palindromeCheck(result)==true){
                  System.out.println(result);
              }
            }
        }
    }
}
