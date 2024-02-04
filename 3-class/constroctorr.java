class Demo{
  public int x;
  public int y;
  public Demo(){
    System.out.println("Hello");
  }
  public Demo(int val1, int val2){
    x=val1;
    y=val2;
    System.out.println("Demo");
  }
}


public class constroctorr {
  public static void main(String[] args){
    Demo obj1 = new Demo();
    Demo obj2 = new Demo(300,400);
    obj1.x=100;
    obj1.y=200;
    // obj2.x=300;
    // obj2.y=400;
    System.out.println(obj1.y + obj2.x);
  }
}

