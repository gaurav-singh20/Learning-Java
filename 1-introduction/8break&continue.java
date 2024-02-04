// import java.io.*;
// import java.util.*;
import java.util.Scanner;

class Hello{
  public static void main(String[] args){
    Scanner in =new Scanner(System.in);
    int x=5;
    int i=1;
    // for(;i<10;i++){
    //   System.out.println(i*x);
    //   if(i==5){
    //     break;
    //   }
    // }
    // System.out.println(i);
    for(;i<4;i++){
      System.out.println(i);
      if(i==2){
        continue;
      }
      System.out.println(i);
    }
  }
}