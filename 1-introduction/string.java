// import java.io.*;
// import java.util.*;
// import java.util.Scanner;

class string{
  public static void main(String[] args){
    String str1="hello \"gaurav\" how are you :\\"; //to include " " and \, put a \ before.
    String str2=str1.toUpperCase();
    System.out.println(str1.length());
    System.out.println(str2);
    System.out.println(str1.indexOf("how"));
    System.out.println(str1.indexOf("pow"));
    System.out.println(str1 + str2);
    System.out.println(str1 + str2 + 2 + 3);
    System.out.println(2+ 3+ str1 + str2 );
  }
}