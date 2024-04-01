import java.util.*;
public class functional_prog{
    public static void main(String args[]){
        List<Integer> l=new ArrayList<>(Arrays.asList(1,2,6,8));
        int s=l.stream().reduce(0,(a,b)->a+b);
        System.out.println("Sum is: "+s);
    }
}