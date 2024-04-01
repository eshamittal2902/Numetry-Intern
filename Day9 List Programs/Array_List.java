import java.util.*;
public class Array_List{
    public static void main(String args[]){
        //Creating ArrayList
        ArrayList<String> emp=new ArrayList<String>();

        //Adding elements to ArrayList
        emp.add("Raj");
        emp.add("Dev");
        emp.add("Jade");
        emp.add("Roh");
        System.out.println(emp);

        //Accessing elements
        System.out.println(emp.get(1));

        //Updating elements
        emp.set(3,"AA");
        System.out.println(emp);

        //Removing elements
        emp.remove(3);
        System.out.println(emp);

        //Removing all elements
        emp.clear();
        System.out.println(emp);
    }
}