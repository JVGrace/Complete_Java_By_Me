
import java.util.Scanner;

public class Tesr{
	public static boolean fn(int i){
		for(int j=1;j<i/2;j++){
		    if(i%i==0){
				return false;
		}
    }	
	return true;	
	} 
	public static void main(String[] args){
	System.out.println("Checking prime no's from 1 to 100");
    Scanner sc =new Scanner(System.in);
    int i=sc.nextInt();
	boolean check=Tesr.fn(i);
    if(check==true){
        System.out.println(i+" is a prime number");

    }
    else{
        System.out.println(i+" is not a prime number");
    }
		
	

}
}