import java.util.*;

class Emp2{
    int salary;
    String name;
    Emp2(String name,int salary) {
        this.name=name;
        this.salary=salary;
    }
    @Override
    public String toString(){
        return ("Name : "+name+" Salary: "+salary);
    }
    
}

// Using method reference override fn inf method:
@FunctionalInterface
interface f1{
    void add();
}

public  class Assignment_LambdaExample{
    public void newadd(){
        System.out.println("Override funtional inf or implements it using another method ref");
    }
    public static void main(String[] args) {
        ArrayList<Object> al= new ArrayList();
        al.add(new Emp2("Dha",9883));
        al.add(new Emp2("vicky",983222));
        al.add(new Emp2("Ramanjeya",988300));
        // HashSet
        Collections.sort(al,(o1,o2)->{
            Emp2 i1 =(Emp2)o1;
            Emp2 i2 =(Emp2)o2;
            return (Integer)(i2.salary-i1.salary);
        });
        System.out.println(al);
        // 
        System.out.println("Method Reference example:");
        f1 f=new Assignment_LambdaExample()::newadd;
        f.add();
    }
}

