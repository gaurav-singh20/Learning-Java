public class array_pair {
  public static void main(String[] args){
    int[] arr = {2,6,7,4,6,5,1,9,1,5};
    int sum=10;
    for(int i=0;i<arr.length;i++){
      for(int j=i+1;j<arr.length;j++){
        if(arr[i]+arr[j]==sum){
          System.out.println("yes");
          return;
        }
      }
    }
    System.out.println("no");
  }
}
