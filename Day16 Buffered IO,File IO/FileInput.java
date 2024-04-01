import java.io.*;
public class FileInput {
    public static void main(String args[]){
        try{
            FileInputStream in=new FileInputStream("file.txt");
            int i=in.read();
            System.out.print((char)i);
            int j=0;
            while((j=in.read())!=-1){
                System.out.print((char)j);
            }
            in.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
