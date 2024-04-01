import java.util.*;
public class Stacks {
    public static void push(Stack<Integer> s){
        for(int i=0;i<4;i++){
            s.push(i);
        }
    }
    public static void pop(Stack<Integer> s){
        System.out.println("Pop: ");
        for(int i=0;i<4;i++){
            int y=s.pop();
            System.out.println(y);
        }
    }
    public static void search(Stack<Integer> s,int e){
        int p=s.search(e);
        if(p==-1){
            System.out.println("Element not found");
        }
        else{
            System.out.println("Element found at position: "+p);
        }
    }

    public static void main(String[] args){
        Stack<Integer> st=new Stack<Integer>();
        push(st);
        pop(st);
        search(st,1);
    }
}
