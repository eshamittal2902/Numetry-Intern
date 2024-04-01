import java.io.*;
public class DataInput {
    public static void main(String args[]) throws IOException{
        FileInputStream inp=new FileInputStream("data1.txt");
        DataInputStream din=new DataInputStream(inp);
        int c=inp.available();
        byte[] ar=new byte[c];
        din.read(ar);
        for(byte b: ar){
            char ch=(char) b;
            System.out.print(ch);
        }
        din.close();
    }
}
