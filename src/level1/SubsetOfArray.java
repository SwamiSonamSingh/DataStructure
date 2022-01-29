package level1;
import java.util.*;
public class SubsetOfArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int subNum=(int) Math.pow(2,n);
//        System.out.println(subNum);
        for(int i=0;i<subNum;i++){
            String result="";
            int temp=i;
            for(int j=arr.length-1;j>=0;j--){
                int rem=temp%2;
                temp=temp/2;
                if(rem==0){
                    result=" - "+result;
                }
                else{
                    result=arr[j]+" "+result;
                }
            }
            System.out.println(result);
        }
    }
}
