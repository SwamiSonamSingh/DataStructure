package level1;
import java.util.*;
public class FindElement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int findNumber=sc.nextInt();
        int result=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==findNumber){
                result=i;
            }
        }
        System.out.println(result);
    }
}
