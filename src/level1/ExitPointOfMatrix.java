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
        int direction=0;
        int i=0;
        int j=0;
        while(true){
            direction=(direction+arr[i][j])%4;
            if(direction==0){
                j++;
            }
            else if(direction==1){
                i++;
            }
            else if(direction==2){
                j--;
            }
            else if(direction==3){
                i--;
            }
            if(i<0){
                i++;
                break;
            }
            else if(j<0){
                j++;
                break;
            }
            else if(i==row){
                i--;
                break;
            }
            else if(j==col){
                j--;
                break;
            }
        }
        System.out.println(i+" "+j);
    }
}
