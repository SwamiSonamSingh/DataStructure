package level1;
import java.util.*;
public class StateOfWakanda {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        int col= sc.nextInt();
        int arr[][]=new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<col;i++){
            if(i%2==0){
                for(int j=0;j<row;j++){
                    System.out.println(arr[j][i]);
                }
            }
            else{
                for(int k=row-1;k>=0;k--){
                    System.out.println(arr[k][i]);
                }
            }
//            System.out.println();
        }
    }
}
