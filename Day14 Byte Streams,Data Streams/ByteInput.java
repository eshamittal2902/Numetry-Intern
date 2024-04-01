import java.io.ByteArrayInputStream;
public class ByteInput{
    public static void main(String args[]){
        byte[] arr={1,2,3,4,5};
        try{
            ByteArrayInputStream inp=new ByteArrayInputStream(arr);

            //available method
            System.out.println("Avaiable bytes: "+inp.available());
            System.out.println("Input stream: ");
            for(int i=0;i<arr.length;i++){
                int d=inp.read();
                System.out.print(d+" ");
            }
            
            inp.close();
        }catch(Exception e){
            e.getStackTrace();
        }
    }
}