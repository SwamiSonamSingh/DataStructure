package level1;
import java.util.*;
public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int element=sc.nextInt();
        int i=0;
        int j=arr.length-1;
        int place=-1;
        while(i<=j){
            int mid=(i+j)/2;
            if(arr[mid]==element){
                System.out.println("Element found @ place "+(mid+1));
                place=mid+1;
                break;
            }
            else if(element>arr[mid]){
                    i=mid+1;
//                    j=arr.length-1;
            }
            else if(element<arr[mid]){
                j=mid-1;
            }
            else{
                System.out.println("Not found");
            }
        }
        if(place == -1){
            System.out.println("Not found element");
        }
    }
}
