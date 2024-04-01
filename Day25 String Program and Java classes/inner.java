class Outer {  
    private int num = 10;  
 
    public class Inner{
       public int getNum() {
          System.out.println("hello");
          return num;
       }
    }
 }
 
 public class inner {
    public static void main(String args[]) {
       Outer out = new Outer();
       Outer.Inner in= out.new Inner();
       System.out.println(in.getNum());
    }
 }