import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class io {
    public static void main(String args[]) throws IOException{
        FileInputStream input=null;
        FileOutputStream output=null;
       
            input=new FileInputStream("i.txt");
            output=new FileOutputStream("o.txt");
            int c;
            while((c=input.read())!=-1){
                output.write(c);
            }
       
            if(input!=null){
                input.close();
            }
            if(output!=null){
                output.close();
            }
       
    }
}
