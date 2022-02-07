package level1;
import java.util.*;
public class SearchInSorted2DArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int arr[][]=new int[size][size];
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int element=sc.nextInt();
        int rowIndex=-1;
        int colIndex=-1;
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                if(arr[i][j]==element){
                    rowIndex=i;
                    colIndex=j;
                }
            }
        }
        if(rowIndex==-1 || colIndex==-1){
            System.out.println("Not found");
        }
        else{
            System.out.println(rowIndex+"\n"+colIndex);
        }
    }
}
