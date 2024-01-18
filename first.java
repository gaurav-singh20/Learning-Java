// class HelloWorld {
//   int y;
//     public static void main(String[] args) {
//       int x=3;
//       String s="Gaurav";
//       System.out.println("Hello, World!");
//       System.out.print("Hello, World!");
//       System.out.println("Hello, World!");
//       System.out.println(x+s);
//     }
// }
// storing integers-
  // byte - 1 byte
  // short - 2 byte
  // int - 4 byte
  // long - 8 byte

class HelloWorld {
    public static void main(String[] args) {
      int x=37;
      // int y=26;
      // int z=14;
      // String s="Gaurav";
      // System.out.println(x+s+y+z);
      // System.out.println(x+y+z);
      long a = x;//conversion
      System.out.print(a);
    }
}

// byte --> Short --> int --> long (automatic type casting,automatic conversion)
class HelloWorld {
    public static void main(String[] args) {
      int x=37;
      long y=x; //conversion
      char ch='B';
      int w=ch;
      System.out.print(y);
      System.out.print(w);
    }
}

//long--> int --> Short --> byte (explicit type casting, explicit conversion)
class HelloWorld {
    public static void main(String[] args) {
      int x=37;
      byte z=(byte)x;
      System.out.print(z);
    }
}