import java.util.Scanner;

public class two_D_Dupl {
  public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    int range= sc.nextInt();
    range++;
    int row= sc.nextInt();
    int col= sc.nextInt();
    int arr[][]= new int[row][col];
    int arr2[]= new int[range];
    
    for(int i=0;i<row;i++){
      for(int j=0;j<col;j++){
        arr[i][j] = sc.nextInt();
      }
    }
    for(int i=0;i<range;i++){
        arr2[i] = 0;
    }
    
    for(int i=0;i<row;i++){
      for(int j=0;j<col;j++){
        int temp = arr[i][j];
        arr2[temp]++;
      }
    }
    
    for(int i=0;i<range;i++){
        if(arr2[i]>1){
          System.out.print(i+" ");
        }
    }
  }
}
