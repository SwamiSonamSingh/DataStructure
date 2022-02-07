package level1;
import java.util.*;
public class SaddlePoint {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int arr[][]=new int[size][size];
        for(int i=0;i<size;i++) {
            for (int j = 0; j < size; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        for(int i=0;i<size;i++){
            int index=0;
            for(int j=1;j<size;j++){
                if(arr[i][j]<arr[i][index]){
                    index=j;
                }
            }
            boolean status=true;
            for(int j=0;j<size;j++){
                if(arr[j][index]>arr[i][index]){
                    status=false;
                    break;
                }
            }
            if(status==true){
                System.out.println(arr[i][index]);
                return;
            }
        }
    }
}
