import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class oldinputwayofJAVA{
    public static void main(String[] args) throws IOException{
        InputStreamReader in= new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(in);
        System.out.println("Enter Integer value: ");
        int num =Integer.parseInt(br.readLine());
        System.out.println("Output: "+ num);
        System.out.println("Enter String value:");
        String st=br.readLine();
        System.out.println("Output: "+ st);
        br.close();
    }
}