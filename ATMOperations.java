import java.util.Arrays;
import java.util.Scanner;

public class ATMOperations {
    double balance;
	final private String[] users= {"new1","new2","new3"};
	final private String[] passwords={"ouds","yza","irsa"};
    boolean checkPassword(String user,String password) {
    	boolean checkPass=false;
		String[] userCheck=this.users;
		String[] passwordCheck=this.passwords;
    	if((Arrays.asList(passwordCheck).contains(password)) && (Arrays.asList(userCheck).contains(user))){
    		checkPass=true;
    	}
    	return checkPass;
    }
    double checkBalance() {
    	return balance;
    }
    boolean withDrawAmount(double amount) {
    	boolean succuss=false;
    	if(balance>=amount) {
    		balance-=amount;
    		succuss=true;
    	}
      return succuss;
    }
    boolean depositeAmount(double amount) {
    	boolean succuss=false;
    	if(amount>0) {
    		balance+=amount;
    		succuss=true;
    	}
    	return succuss;
    }
	public static void main(String[] args) {
		boolean exit = false;
        try (Scanner sc = new Scanner(System.in)) {
            ATMOperations ob1=new ATMOperations();
            System.err.println("Enter User Name From Following:");
            for (String user1 : ob1.users) {
                System.err.println(user1);
            }
            String user= sc.nextLine();
            
            System.out.println("Enter the your Password:");
            String pass=sc.nextLine();
            if(ob1.checkPassword(user,pass)==false) {
                System.out.println("Invalid Password... Access Denied");
                sc.close();
                exit=true;
            }
            while(!exit) {
                System.out.println("1.Check Balance");
                System.out.println("2.Deposite Amount");
                System.out.println("3.Withdraw Amount");
                System.out.println("4.Exit");
                int op=sc.nextInt();
                switch(op) {
                    case 1 -> System.out.println("Your Current Balance="+ob1.checkBalance());
                    case 2 -> {
                        System.out.println("Enter Amount to Deposite:");
                        double am1=sc.nextDouble();
                        if(ob1.depositeAmount(am1)) {
                            System.out.println(am1+" is succussfully Deposited..");
                        }else {
                            System.out.println(am1+" is Invalid Amount");
                        }
                    }
                    case 3 -> {
                        System.out.println("Enter Amount to Withdraw:");
                        double am2=sc.nextDouble();
                        if(ob1.withDrawAmount(am2)) {
                            System.out.println(am2+" is succussfully Withdrawn..");
                        }else {
                            System.out.println("Insuffient Balance");
                        }
                    }
                    case 4 -> {
                        exit=true;
                        System.out.println("Thank you for Using Our Services");
                    }
                }
            }
        }
	}

}
