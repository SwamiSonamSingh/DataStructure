package level1;
import java.util.*;
public class InvertedBarChart {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        int max=arr[0];
        for(int i=1;i<arr.length-1;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
//        System.out.println(max);
        for(int i=0;i<max;i++){
            for(int j=0;j<arr.length;j++){
                if(arr[j]>i){
                    System.out.print(" * ");
                }
                else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}
