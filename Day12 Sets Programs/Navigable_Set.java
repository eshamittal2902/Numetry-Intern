import java.util.*;
public class Navigable_Set {
    public static void main(String args[]){
        NavigableSet<Integer> n=new TreeSet<Integer>();
        n.add(1);
        n.add(5);
        n.add(7);
        n.add(8);
        System.out.println("Navigable Set is: "+n);

        //access first element
        int e1=n.first();
        System.out.println("First element is: "+e1);

        //access last element
        int e2=n.last();
        System.out.println("Last element is: "+e2);

        //remove first element
        int e3=n.pollFirst();
        System.out.println("Remove first element: "+e3);

        //remove last element
        int e4=n.pollLast();
        System.out.println("Remove last element: "+e4);
    }
}
