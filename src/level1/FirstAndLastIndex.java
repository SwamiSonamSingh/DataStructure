package level1;
import java.util.*;
public class FirstAndLastIndex {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int element=sc.nextInt();
        int last=-1;
        int first=-1;
        int left=0;
        int right=arr.length-1;
        while(left<=right){
            int mid=(left+right)/2;
            if(element==arr[mid]){
                last=mid;
                left=mid+1;
            }
            else if(element>arr[mid]){
                left=mid+1;
            }
            else if(element<arr[mid]){
                right=mid-1;
            }
        }
        left=0;
        right=arr.length-1;
        while(left<=right){
            int mid=(left+right)/2;
            if(element==arr[mid]){
                first=mid;
                right=mid-1;
            }
            else if(element>arr[mid]){
                left=mid+1;
            }
            else if(element<arr[mid]){
                right=mid-1;
            }
        }
//        System.out.println(first+" "+last);
        System.out.println(first+" "+last);
    }
}
