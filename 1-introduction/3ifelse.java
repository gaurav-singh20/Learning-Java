import java.io.*;
import java.util.*;
import java.util.Scanner;

class Hello{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    int x=input.nextInt();
    if(x>=18){
      System.out.println("hello");
    }
    else if(x<18 && x>15){
      System.out.println("sorry");
    }
    else{
      System.out.println("child");
    }
  }
}