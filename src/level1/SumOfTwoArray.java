package level1;
import java.util.*;
public class SumOfTwoArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size1=sc.nextInt();
        int arr1[]=new int[size1];
        for(int i=0;i<arr1.length;i++){
            arr1[i]=sc.nextInt();
        }
        int size2=sc.nextInt();
        int arr2[]=new int[size2];
        for(int i=0;i<arr2.length;i++){
            arr2[i]=sc.nextInt();
        }
        int sum[]=new int[size1>size2 ? size1 : size2];
        int carry=0;
       int i=arr1.length-1;
       int j=arr2.length-1;
       int k=sum.length-1;
       while(k>=0){
           int digit=carry;
           if(i>=0){
               digit=digit+arr1[i];
           }
           if(j>=0){
               digit=digit+arr2[j];
           }
           carry=digit/10;
           digit=digit%10;
           sum[k]=digit;
           i--;
           j--;
           k--;
       }
        if(carry>0){
            System.out.println(carry);
        }
       for(int res:sum){
           System.out.println(res);
       }
    }
}
