import java.io.*;
public class BufferedOutput {
    public static void main(String args[]) throws IOException{
        FileOutputStream fout=new FileOutputStream("file1.txt");
        BufferedOutputStream bout=new BufferedOutputStream(fout);
        String s="Hello !!";
        byte b[]=s.getBytes();
        bout.write(b);
        bout.flush();
        bout.close();
        fout.flush();
        System.out.println("Done");
    }
}
