public class annonymous {
    public static void main(String args[]) {
        AnIn in = new AnIn() {
           public void hi() {
              System.out.println("Anonymous inner class");
           }
        };
        in.hi();	
     }
}
abstract class AnIn {
    public abstract void hi();
 }
