package level1;
import java.util.*;
public class RotateArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int i=0;
        int j=arr.length-1;
        while(i<=j){
//            System.out.println(i+" "+j);
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        for(int val:arr){
            System.out.print(val+" ");
        }
    }
}
