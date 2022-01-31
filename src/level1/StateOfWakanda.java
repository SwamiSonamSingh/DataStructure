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
        int result[][]=new int[row][col];
        for(int i=0;i<row;i++){
            for(int k=0;k<col;k++){
                result[row][col]=arr[i][j];
            }
        }
    }
}
