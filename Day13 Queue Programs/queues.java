import java.util.*;
public class queues{
    public static void main(String args[]){
        Queue<String> q=new LinkedList<>();
        q.add("harry");
        q.add("ricky");
        q.add("rita");
        q.add("sakshi");
        System.out.println("Queue is: "+q);

        //remove the element at front
        String f=q.remove();
        System.out.println("Removed element: "+f);
        System.out.println("Updated queue: "+q);

        //add another element
        q.add("abhi");
        System.out.println("After adding element: "+q);

        //peek element
        String p=q.peek();
        System.out.println("Peak element: "+p);
        
    }
}