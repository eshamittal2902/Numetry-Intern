import java.io.*;
public class DataOutput {
    public static void main(String args[]) throws IOException{
        FileOutputStream f=new FileOutputStream("data2.txt");
        DataOutputStream d=new DataOutputStream(f);
        d.writeInt(65);
        d.flush();
        d.close();
        System.out.println("Done");
    }
}
