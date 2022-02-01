package level1;
import java.util.*;
public class SpiralMatrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        int col=sc.nextInt();
        int arr[][]=new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int minRow=0;
        int minCol=0;
        int maxRow=row-1;
//        System.out.println(maxRow);
        int maxCol=col-1;
//        System.out.println(maxCol);
        int dimension=row*col;
        int count=0;
        while(count<dimension){
            for(int i=minRow,j=minCol;i<=maxRow && count<dimension;i++){
                System.out.println(arr[i][j]);
                count++;
            }
            minCol++;
            for(int i=minCol,j=maxRow;i<=maxCol && count<dimension;i++){
                System.out.println(arr[j][i]);
                count++;
            }
            maxRow--;
            for(int i=maxRow,j=maxCol;i>=minRow && count<dimension;i--){
                System.out.println(arr[i][j]);
                count++;
            }
            maxCol--;
            for(int i=maxCol,j=minRow;i>=minCol && count<dimension;i--){
                System.out.println(arr[j][i]);
                count++;
            }
            minRow++;
        }
    }
}
