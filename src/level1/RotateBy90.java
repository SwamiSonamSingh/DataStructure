package level1;
import java.util.*;
public class RotateBy90 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int dimenssion=sc.nextInt();
        int arr[][]=new int[dimenssion][dimenssion];
        for(int i=0;i<dimenssion;i++){
            for(int j=0;j<dimenssion;j++){
                arr[i][j]= sc.nextInt();
            }
        }
        for(int i=0;i<dimenssion;i++){
            for(int j=dimenssion-1;j>=0;j--){
                System.out.print(arr[j][i]+" ");
            }
            System.out.println();
        }
    }
}
