class Demo{
  public int x;
  public int y;
}


public class oops {
  public static void main(String[] args){
    Demo obj1 = new Demo();
    Demo obj2 = new Demo();
    obj1.x=100;
    obj1.y=200;
    obj2.x=300;
    obj2.y=400;
    System.out.println(obj1.y + obj2.x);
  }
}
