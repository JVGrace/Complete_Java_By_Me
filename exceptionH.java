// exception handling
// exception throwable parent for all exceptions and errors
// runtime exception : unchecked exception child of throwable
import java.util.Scanner;
class InsufficientBalanceException extends RuntimeException {

}
public class exceptionH{
    public static void main(String[] args){
        
        withdraw();
    }
    static void withdraw(){
        double balance=1000.02;
        int am;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter Balance to Withdraw");
            am = sc.nextInt();
        }
        if (am<=balance)System.out.println("Amount successfully withdrawn");
        else throw new InsufficientBalanceException();
        
    }
}