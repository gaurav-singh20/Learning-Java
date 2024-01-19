import java.io.*;
import java.util.*;
import java.util.Scanner;

class Hello{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    int x=input.nextInt();
    int y=input.nextInt();
    //char G = input.next().charAt(0);
    //input.nextByte();
    //input.nextDouble();
    //input.nextFloat();
    String s=input.nextLine();
    int sum= x+y;
    System.out.println(sum+s);
  }
}