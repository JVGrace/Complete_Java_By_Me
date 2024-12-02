
import java.util.TreeSet;

class EmployeeAgain{
    int salary;
    String name;
    

    public EmployeeAgain(String name,int salary) {
        this.name=name;
        this.salary=salary;
    }

    @Override
    public String toString() {
        return "Name: "+name+" Salary: "+salary;
    }
    
}
public class treeSetExample {
    public static void main(String[] args) {
        TreeSet ts = new TreeSet((o1,o2)->{
            EmployeeAgain i1 =(EmployeeAgain)o1;
            EmployeeAgain i2 =(EmployeeAgain)o2;
            return (Integer)(i2.salary-i1.salary);
        });
        ts.add(new EmployeeAgain("Hello", 989832));
        ts.add(new EmployeeAgain("Hgdd", 989843));
        ts.add(new EmployeeAgain("Hreewree", 1982333223));
        ts.add(new EmployeeAgain("Hefe", 982333223));
        System.out.println("Output: "+ts);

        // Another Approach
        // System.out.println("Another Approach: ");
        // TreeSet ts1 = new TreeSet();
        // Comparator cp = (o1,o2)->{
        //     EmployeeAgain em1 = (EmployeeAgain)o1;
        //     EmployeeAgain em2 = (EmployeeAgain)o2;
        //     return (int)(em1.salary-em2.salary);
        // };
        // ts1.add(new EmployeeAgain("Wow", 9832));
        // ts1.add(new EmployeeAgain("Wow2", 92));
        // ts1.add(new EmployeeAgain("Wow3", 982));
        // System.out.println("Output New :"+ts1);

    }
}
