package level1;
import java.util.*;
public class InverseOfArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int invert[]=new int[n];
        for(int i=0;i<arr.length;i++){
            invert[arr[i]]=i;
        }
        for(int i:invert){
            System.out.println(i);
        }
    }
}
