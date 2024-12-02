import java.io.*;
import java.net.*;

public class clientServerExample {
    public static void main(String[] args) throws IOException {
        try (Socket s = new Socket("localhost",3212)) {
            System.out.println("Connected To server!!");
            InputStream is =s.getInputStream();
            InputStreamReader isr=new InputStreamReader(is);
            BufferedReader br= new BufferedReader(isr);
            String msg=br.readLine();
            System.out.println("Server :"+msg);
        }
    }

}
