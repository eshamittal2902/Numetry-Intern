import java.util.*;
public class arraydeques {
    public static void main(String args[]){
        Deque<Integer> adq=new ArrayDeque<>();
        adq.offer(1);
        adq.offer(3);
        adq.offer(4);
        adq.offer(5);
        System.out.println("ArrayDeque is: "+adq);
        adq.offerFirst(2);
        adq.offerLast(6);
        System.out.println("Updated arraydeque is: "+adq);
        adq.pollFirst();
        adq.pollLast();
        System.out.println("New arraydeque is: "+adq);
    }
}
