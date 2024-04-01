public class exception_handling{
    public static void main(String args[]){
        try{
            int a=20/0;
            System.out.println(a);
        }catch(ArithmeticException e){
            System.out.println(e);
        }
        finally{
            System.out.println("Always executed");
        }
        System.out.println("Hello");
    }
}