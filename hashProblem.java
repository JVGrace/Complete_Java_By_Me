import java.util.Scanner;

public class hashProblem {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String password=sc.nextLine();
        String encrptyString="";
        
        for(int i=0;i<password.length();i++){
            encrptyString+=password.charAt(i);
        }
    }
}
