import java.io.ByteArrayOutputStream;
public class ByteOutput {
    public static void main(String args[]){
        String d="How are you";
        try{
            ByteArrayOutputStream out=new ByteArrayOutputStream();
            out.write(d.getBytes());
            byte[] bd=out.toByteArray();
            System.out.println("Data using toByteArray: ");
            for(int i=0;i<bd.length;i++){
                System.out.print((char)bd[i]);
            }
            String sd=out.toString();
            System.out.println();
            System.out.println("Data using toString: "+sd);
            out.close();
        }catch(Exception e){
            e.getStackTrace();
        }
    }
}
