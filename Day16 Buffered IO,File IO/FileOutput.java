import java.io.*;
public class FileOutput{
    public static void main(String args[]){
       try{
        FileOutputStream out=new FileOutputStream("file.txt");
        out.write(68);
        String s="\nWelcome";
        byte b[]=s.getBytes();
        out.write(b);
        out.close();
        System.out.println("Done");
       }catch(Exception e){
            System.out.println(e);
       }
    }
}