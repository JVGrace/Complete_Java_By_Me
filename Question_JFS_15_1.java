/* Question: Create arraylist object then take input in string from user using scanner then convert to Integer
 * using Wrapper (Integer) class :> then add in arraylist then using iterator print values added
 * also use try catch for handling exceptions:
 * @author: Pradumn Patel 
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Question_JFS_15_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Give Value to convert to Integer: ");
        ArrayList aL=new ArrayList<>();
        try {
            System.out.println("Give values to string in loop: ");
            System.out.println("How many Values user wants to give? ");
            int count = sc.nextInt();
            
            while(count!=0){
                System.out.println("Give value: ");
                String s=sc.next();
                int i=Integer.parseInt(s);
                aL.add(i);
                count--;
            }
            System.out.println("All values will be printed using Iterator below: ");
            Iterator itr =aL.iterator();
            int CountNew=0;
            while(itr.hasNext()){
                Integer ans =(Integer)itr.next();
                System.out.println("Index: "+CountNew+" : "+ans);CountNew++;
            }
            
        } catch (Exception e) {
            System.out.println("Some Problem occured : Number Format Most Probably.");
        }
    }
    
}
