import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Optional;

class EmployeeeObjects{
    int empid;
    String name;

    public EmployeeeObjects(int empid,String name) {
        this.empid=empid;
        this.name=name;
    }

    
}
public class employeedetailobject {
    public static void main(String[] args) {
        ArrayList<EmployeeeObjects> al = new ArrayList<>();
        al.add(new EmployeeeObjects(10,"Helllo"));
        al.add(null);
        al.add(new EmployeeeObjects(120,"H90elllo"));
        al.add(new EmployeeeObjects(432,null));
        for (EmployeeeObjects elem : al) {
            if(Optional.ofNullable(elem).isPresent())
            {   
                Optional.ofNullable(elem).ifPresent((i)->{
                    System.out.println("Employee Object found!!  ID: "+i.empid);
                });

                System.out.println("Emp name : "+elem.name+"  id: "+elem.empid);
            }
            else{
                System.out.println("Employee not found! or null value present");
            }
        }
        System.out.println("Now we will print using iterator: ");
        @SuppressWarnings("rawtypes")
        ListIterator itr = al.listIterator();
        while (itr.hasNext()) {
            EmployeeeObjects elem =  (EmployeeeObjects) itr.next();
            if(Optional.ofNullable(elem).isPresent()){
                System.out.println("Emp name : "+elem.name+"  id: "+elem.empid);
            }
            else{
                System.out.println("Employee not found! or null value present");
            }
        }
        }
}
