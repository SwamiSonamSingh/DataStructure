package level1;
import java.util.*;
public class SecondLargestElement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        if(arr.length<2){
            System.out.println("No any second largest element");
        }
        else{
            Arrays.sort(arr);
            for(int i=arr.length-2;i>=0;i--){
                if(arr[i]!=arr[arr.length-1]){
                    System.out.println(arr[i]);
                    break;
                }
            }
        }
    }
}
