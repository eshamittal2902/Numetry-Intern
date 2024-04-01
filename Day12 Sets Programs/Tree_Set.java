import java.util.*;
public class Tree_Set {
    public static void main(String args[]){
        Set<Integer> t=new TreeSet<Integer>();
        t.add(5);
        t.add(8);
        t.add(3);
        t.add(2);
        t.add(7);
        System.out.println("TreeSet is: "+t);

        //iterating
        Iterator<Integer> i=t.iterator();
        System.out.println("Iterating tree set: ");
        while(i.hasNext()){
            System.out.println(i.next());
        }
    }
}
