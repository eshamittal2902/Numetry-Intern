public class multithreading {
    public static void main(String args[]){
        A a1=new A();
        a1.start();
        B b1=new B();
        b1.start();
    }
}
class A extends Thread{
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("Thread A "+i);
        }
    }
}
class B extends Thread{
    public void run(){
        for(int j=0;j<5;j++){
            System.out.println("Thread B "+j);
        }
    }
}
