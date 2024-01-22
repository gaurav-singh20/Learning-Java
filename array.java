import java.io.*;
import java.util.*;
import java.util.Scanner;

// class array{
//   public static void main(String[] args){
//     int[] marks = {5,6,7,8,9};
//     int ele=45;
//     int sum=0;
//     System.out.println(marks.length);
//     for(int i=0;i<marks.length;i++){
//       System.out.println(marks[i]);

//       // if(marks[i]%2==0)
//       // System.out.println(marks[i]);

//       // if(marks[i]==ele){
//       //   System.out.print(i);
//       //   break;
//       // }
//       // if(i==5)
//       // System.out.print("-1");

//       sum+=marks[i];
//     }
//     System.out.print(sum);
//   }
// }

class array{
    public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      int[] marks = new int[10];
      // System.out.println(marks.length);
      
      for(int i=0;i<marks.length;i++){
        marks[i]=sc.nextInt()+1;
        marks[i]=sc.nextInt();
      }

      for(int i=0;i<marks.length;i++){
        System.out.println(marks[i]);
      }
    }
  }