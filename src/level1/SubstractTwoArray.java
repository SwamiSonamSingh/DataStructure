package level1;
import java.util.*;
public class SubstractTwoArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int arr1[]=new int[n1];
        for(int i=0;i<arr1.length;i++){
            arr1[i]=sc.nextInt();
        }
        int n2=sc.nextInt();
        int arr2[]=new int[n2];
        for(int i=0;i<arr2.length;i++){
            arr2[i]=sc.nextInt();
        }
        int res[]=new int[n2];
//        System.out.println(res.length);
        int i=arr1.length-1;
        int j=arr2.length-1;
        int k=res.length-1;
        int carry=0;
        while(k>=0){
            int digit=0;
            int arr1value=i>=0? arr1[i]:0;
//            System.out.println(i);
//            System.out.println(j);
            if(arr2[j]+carry>=arr1value){
                digit=arr2[j]-arr1value+carry;
                carry=0;
            }
            else{
                digit=arr2[j]+10-arr1value+carry;
                carry=-1;
            }
            res[k]=digit;
            i--;
            j--;
            k--;
        }
        int precidingZeroIndex=0;
        while(precidingZeroIndex>=0){
            if(res[precidingZeroIndex]==0){
                precidingZeroIndex++;
            }
            else{
                break;
            }
        }
       while(precidingZeroIndex<res.length){
           System.out.println(res[precidingZeroIndex]);
           precidingZeroIndex++;
       }
    }
}
