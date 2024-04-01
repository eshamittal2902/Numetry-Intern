import java.util.Scanner;
public class string{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s=sc.nextLine();
        count(s);
        sc.close();
    }

    public static void count(String st){
        int alph=0;
        int num=0;
        int sp=0;
        char ch;
        for(int i=0;i<st.length();i++){
            ch=st.charAt(i);
            if(ch>='a' && ch<='z' || ch>='A' && ch<='Z'){
                alph++;
            }
            else if(ch>='0' && ch<='9'){
                num++;
            }
            else{
                sp++;
            }
        }
        System.out.println("Number of alphabets: "+alph);
        System.out.println("Number of numbers: "+num);
        System.out.println("Number of sp: "+sp);
    }
}