import java.util.Scanner;

class BalanceInsufficientException extends RuntimeException {
    public BalanceInsufficientException(String msg){
        super(msg);
    }
}
class InvalidAmountException extends RuntimeException {
    
    public InvalidAmountException(String msg) {
        super(msg);
    }
    
}
public class codingProblemJavaTest {
    public static void main(String[] args){
        withdraw();
    }
    static void withdraw(){
        double balance=1000.00;
        int am;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter Balance to Withdraw");
            am = sc.nextInt();
        }
        if (am<=balance && am%100==0){
            System.out.println("Amount successfully withdrawn");
        }
        else if(am>balance){
            throw new BalanceInsufficientException("Amount is greater than balance");
        }
        else throw new InvalidAmountException("Amount in -ve or not in multiples of 100");
        
    }
}

