/* Unit Convertor Console App
 * 1. Meter Conversion. 
 * 2. Gram Conversion.
 * 3. Temperature Conversion.
 * @author : Pradumn Patel (JV Grace)
 */
import java.util.Scanner;
public class Converter{

public static void menu(){
	System.out.println("Unit Convertor!");
	System.out.println("1.Meter Conversion");
	System.out.println("2.Gram Conversion");
	System.out.println("3.Temperature Conversion");
	System.out.println("4.Exit");
}
public static void main(String[] args){
try (Scanner sc = new Scanner(System.in)) {
	boolean chek=false;
	while(!chek){
	Converter.menu();
	System.out.print("Enter Choice : ");
	int choice=sc.nextInt();
	switch(choice){
	case 1->{
		System.out.println("Enter Meter Value to Convert to Kilometer: ");
		double meter=sc.nextDouble();
		System.out.println("The Result: ");
		System.out.println(meter+" in meters : "+(meter/1000)+" in kilometers");
	}
	case 2->{
		System.out.println("Enter Gram Value to Convert to Kilogram: ");
		double gram=sc.nextDouble();
	
		System.out.println("The Result: ");
		System.out.println(gram+" in grams : "+(gram/1000)+" in kilograms");
		}
	case 3->{
		System.out.println("Enter Temperature in C to convert to F: ");
		double temp=sc.nextDouble();
		System.out.println("The Result: ");
		System.out.println(temp+" in C : "+((9/5)*temp+32)+" in F");
	}
	case 4->{
		System.out.println("Exiting!!");
		chek=true;}
	default->{
	System.out.println("Wrong Choice!!");}
	}
	}
}
}

}

