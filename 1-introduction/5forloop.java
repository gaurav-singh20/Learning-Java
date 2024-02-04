import java.io.*;
import java.util.*;
import java.util.Scanner;

class Hello{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    int x=input.nextInt();
    for(int i=0;i<5;i+=2){
      System.out.println(i+"*"+x+"= "+i*x);
    }
  }
}