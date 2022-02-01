package level1;
import java.util.*;
public class ExitPointOfMatrix {
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
        int minRow=0;
        int minCol=0;
        int maxRow=row-1;
        int maxCol=col-1;
        for(int i=minRow;i<maxRow;i++){
            for(int j=minCol;j<maxCol;j++){
                if(arr[i][j]==1){

                }
            }
        }
    }
}
