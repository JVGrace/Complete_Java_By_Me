/* Password Generator with Random Module 
 * @author : Pradumn Patel (JV Grace)
 */

import java.util.Random;
import java.util.Scanner;

public class PasswordGenerator{
    public static String generatePassword(int length,boolean isIncludeNumbers,boolean isIncludeSymbols,boolean isIncludeUpperCase)
    {
     String numbers=isIncludeNumbers?"0123456789":"";
     String lowerCase="abcdefghijklmnopqrstuvwxyz";
     String uppercase=isIncludeUpperCase?"ABCDEFGHIJKLMNOPQRSTUVWXYZ":"";
     String symbol=isIncludeSymbols?"~!@#$%^&*{}[]?+></":"";
     String allChars=numbers+lowerCase+uppercase+symbol;
     Random r=new Random();
     StringBuilder sbr=new StringBuilder();
     for(int i=0;i<length;i++)
     {
      sbr.append(allChars.charAt(r.nextInt(allChars.length())));
     }
     return sbr.toString();
    }
    public static void main(String[] args) 
    {
    try (Scanner sc = new Scanner(System.in)) {
        System.out.println("Enter the desired password length: ");
        int length=sc.nextInt();
        System.out.println("Include number yes/no");
        boolean isIncludeNumbers=sc.next().equalsIgnoreCase("yes");
        System.out.println("Include symbols yes/no");
        boolean isIncludeSymbols=sc.next().equalsIgnoreCase("yes");
        System.out.println("Include Uppercase yes/no");
        boolean isIncludeUpperCase=sc.next().equalsIgnoreCase("yes");
        System.out.println("Generated Password is: "+generatePassword(length,isIncludeNumbers,isIncludeSymbols,isIncludeUpperCase));
    }
    
    }
}
