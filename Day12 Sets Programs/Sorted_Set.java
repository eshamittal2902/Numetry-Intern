import java.util.*;
public class Sorted_Set {
    public static void main(String args[]){
        SortedSet<Integer> ss=new TreeSet<Integer>();
        ss.add(3);
        ss.add(6);
        ss.add(1);
        ss.add(2);
        System.out.println("Sorted set is: "+ss);

        //adding duplicate element
        ss.add(6);
        System.out.println("After adding duplicate: "+ss);

        //removing element
        ss.remove(1);
        System.out.println("After removing element: "+ss);
    }
}
