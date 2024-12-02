/* Predicate fn is used for filtering oprations filtring a collection based on some condition
 * is a funtional inf so can use lambda  
 */
import java.util.function.Predicate;

public class predicateexample {
    public static void main(String[] args) {
        // Predicate<Double> p1 =(i)->i%2==0;
        // System.out.println("Hello          :"+p1.test(20.3));
        // System.out.println("First question: ");
        // Predicate<Integer> intgreater = (i)->i>10;
        // System.out.println("Value of i : ");
        // Scanner sc = new Scanner(System.in);
        // int no=sc.nextInt();
        // System.out.println("Whether no :"+no+" is greater than 10 or not: "+intgreater.test(no));

        // System.out.println("Second Question: ");
        // Predicate<Double> stringlength = (i)->i>3.00;
        // System.out.println("Value of String length i : ");
        // Double sd=sc.nextDouble();
        // System.out.println("Whether String length :"+sd+" is greater than 3 or not: "+stringlength.test(sd));
        
        // System.out.println("Third Question: ");
        // Collection c = new ArrayList<>();
        // Predicate<Collection> emptyobject = (m)->m.isEmpty();
        // System.out.println("Objet Empty  ");
        
        // System.out.println("Whether Object is empty or not "+emptyobject.test(c));
        
        // Commbining multiple predicates objects
        Predicate<Integer> i1=(i)->i!=10;
        Predicate<Integer> i2=(i)->i==10;
        Predicate<Integer> r=i1.and(i2);
        // Predicate<Integer> r=i1.or(i2);   ::or condition
        // predicates added using "and" or "or" conditions or negate()
        System.out.println("Result of predicates: "+r.test(66));

    }
}
