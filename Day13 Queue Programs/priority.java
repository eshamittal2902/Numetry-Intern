import java.util.*;
public class priority {
    public static void main(String args[]){
        Queue<Integer> pq=new PriorityQueue<>();
        pq.add(5);
        pq.add(9);
        pq.add(14);
        System.out.println("Priority queue: "+pq);

        //peek element
        System.out.println("Peak element: "+pq.peek());

        //displaying top element and removing it
        System.out.println(pq.poll());

        //again first element
        System.out.println(pq.peek());

        //updated queue
        System.out.println("Updated queue is: "+pq);
    }
}
