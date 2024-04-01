class method_local__inner {
    void see() {
       int num = 50;
       class inner{
          public void print() {
             System.out.println("This is method inner class "+num);	   
          }   
       }
       inner in = new inner();
       in.print();
    }
    
    public static void main(String args[]) {
      method_local__inner outer = new method_local__inner();
       outer.see();	   	   
    }
 }