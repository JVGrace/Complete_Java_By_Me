import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

class Example1{
    public void ElementsChecker(ArrayList<Integer> arg){
        arg.sort(null);
        System.out.println("Printing All Elements Sorted: ");
        for(int i:arg){
            System.out.println(i);
        }
    }
}
public class collectionExamples1{
    public static void main(String[] args) {
        Collection<Integer> nums= new ArrayList<>();
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter Size of List");
            int i=sc.nextInt();
            for (; i > 0; i--) {
                System.out.println("Enter element at :");
                nums.add(sc.nextInt());
                
            }
            new Example1().ElementsChecker((ArrayList)nums);
        sc.close();
        }   
    }
}