import java.util.*;
public class Linked_Hash {
    public static void main(String args[]){
        Set<String> l=new LinkedHashSet<String>();
        l.add("Apple");
        l.add("Mango");
        l.add("Grapes");
        System.out.println("LinkedHashSet is: "+l);

        //adding duplicate
        l.add("Grapes");
        System.out.println("After adding duplicate: "+l);

        //removing element
        l.remove("Mango");
        System.out.println("After removing element: "+l);

        //iterating
        Iterator<String> i=l.iterator();
        System.out.println("Iteration:");
        while(i.hasNext()){
            System.out.println(i.next());
        }
    }
}
