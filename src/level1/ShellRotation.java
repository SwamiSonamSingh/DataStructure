package level1;
import java.util.*;
public class ShellRotation {
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
        int shellNo= sc.nextInt();
        int rotation= sc.nextInt();
        int minRow=shellNo-1;
        int minCol=shellNo-1;
        int maxRow=row-shellNo;
        int maxCol=col-shellNo;
        int size=2*(maxRow-minRow+maxCol-minCol);
        int resultArr[]=new int[size];
        int k=0;
        while(k!=size) {
            for (int i = minRow, j = minCol; i <= maxRow && k<size; i++) {
                resultArr[k] = arr[i][j];
                k++;
            }
            for (int i = maxRow, j = minCol + 1; j <= maxCol && k<size; j++) {
                resultArr[k] = arr[i][j];
                k++;
            }
            for (int i = maxRow - 1, j = maxCol; i >= minRow && k<size; i--) {
                resultArr[k] = arr[i][j];
                k++;
            }
            for (int i = minRow, j = maxCol - 1; j >minCol && k<size; j--) {
                resultArr[k] = arr[i][j];
                k++;
            }
        }
        if(rotation<0){
            rotation=size+rotation;
            rotation=rotation%size;
            int start1 = 0;
            int end1 = resultArr.length - rotation - 1;
            int start = end1 + 1;
            int end = resultArr.length - 1;
            while (start < end) {
                int temp = resultArr[start];
                resultArr[start] = resultArr[end];
                resultArr[end] = temp;
                start++;
                end--;
            }
            while (start1 < end1) {
                int temp = resultArr[start1];
                resultArr[start1] = resultArr[end1];
                resultArr[end1] = temp;
                start1++;
                end1--;
            }
        }
        if(rotation>0) {
            rotation=rotation%size;
            int start1 = 0;
            int end1 = resultArr.length - rotation - 1;
            int start = end1 + 1;
            int end = resultArr.length - 1;
            while (start < end) {
                int temp = resultArr[start];
                resultArr[start] = resultArr[end];
                resultArr[end] = temp;
                start++;
                end--;
            }
            while (start1 < end1) {
                int temp = resultArr[start1];
                resultArr[start1] = resultArr[end1];
                resultArr[end1] = temp;
                start1++;
                end1--;
            }
        }
        for(int i=resultArr.length-1;i>=0;i--){
            System.out.println(resultArr[i]);
        }
    }
}
