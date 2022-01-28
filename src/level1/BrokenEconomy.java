package level1;
import java.util.*;
public class BrokenEconomy {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int element=sc.nextInt();
        int left=0;
        int right=arr.length-1;
        int index=-1;
        int ceil=Integer.MAX_VALUE;
        int floor=Integer.MIN_VALUE;
        while(left<=right){
            int mid=(left+right)/2;
            if(element<arr[mid]){
                right=mid-1;
                index=-1;
                ceil=arr[mid];
            }
            else if(element>arr[mid]){
                left=mid+1;
                index=-1;
                floor=arr[mid];
            }
            else if(element==arr[mid]){
                index=mid;
                break;
            }
        }
        if(index!=-1){
            System.out.println(arr[index]);
        }
        else{
            System.out.println(ceil);
            System.out.println(floor);
        }
    }
}
