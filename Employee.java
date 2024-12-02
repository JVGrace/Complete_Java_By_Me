import java.util.*;
class Emp{
    private final String name;
    private final double salary;

    public Emp(String name,double salary) {
        this.name=name;
        this.salary=salary;
    }
    @Override
    public String toString(){
        return "Employee Name: "+this.name+" and Salary: "+this.salary;
    }
     
}
public class Employee{
    @SuppressWarnings({ "unchecked", "rawtypes" })
    public static void main(String[] arg){
        List l1=new ArrayList<>();
    
        l1.add(new Emp("Bobby Deol",557474.3));
        l1.add(new Emp("Sunny Deol",9876332.23));
        l1.add(new Emp("Dharmendra Deol",747473.23));
        System.out.println(l1);
        Iterator<Object> itr=l1.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());}
    }
}