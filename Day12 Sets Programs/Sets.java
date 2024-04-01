import java.util.*;
public class Sets{
    public static void main(String args[]){
       Set<Integer> s1=new HashSet<Integer>();
       s1.addAll(Arrays.asList(new Integer[] {10,24,56,15,67,55}));
       Set<Integer> s2=new HashSet<Integer>();
       s2.addAll(Arrays.asList(new Integer[] {30,24,50,10,40,67}));
       
       //union operation
       Set<Integer> union=new HashSet<Integer>(s1);
       union.addAll(s2);
       System.out.println("Union of sets is: "+union);

       //intersection opeartion
       Set<Integer> inter=new HashSet<Integer>(s1);
       inter.retainAll(s2);
       System.out.println("Intersection of two sets is: "+inter);

       //difference operation
       Set<Integer> diff=new HashSet<Integer>(s1);
       diff.removeAll(s2);
       System.out.println("Difference of two sets is: "+diff);
    }
}