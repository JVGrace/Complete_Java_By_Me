import java.io.*;
import java.net.*;

public class serverExample {
    public static void main(String[] args) throws IOException {
        
        ServerSocket ss=new ServerSocket(3212);
        System.err.println("Server is started at 3212 port");
        Socket clientSocket=ss.accept();
        System.err.println("Client Connected : "+clientSocket.getInetAddress());
        OutputStream os=clientSocket.getOutputStream();
        PrintStream ps=new PrintStream(os,true);
        ps.println("Hey Server connected!!");
        System.err.println("Message Sent!!!....");
    }
    
}
// File in Eclipse folder for easy java compilation and running the server 