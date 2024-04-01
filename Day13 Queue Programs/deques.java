import java.util.*;
public class deques {
    public static void main(String args[]){
        Deque<Integer> dq=new ArrayDeque<>();
        dq.add(1);
        dq.add(4);
        dq.add(2);
        dq.add(8);
        System.out.println("Deque is: "+dq);
        dq.addFirst(3);
        System.out.println("Updated deque: "+dq);
        dq.pop();
        System.out.println("After pop operation: "+dq);
    }
}
