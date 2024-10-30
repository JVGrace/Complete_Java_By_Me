/* Deep Clonable Problem By Vamsi Sir
 * In this we have to deep clone an object that clones object inside it as well so
 * these objects point to new objects when cloned instead of existing objects 
 *  very completed problem indeed 
 * I will probably make it more understandable later
 *  @author: Pradumn Patel
 */

class  Faculty implements  Cloneable {
    private final String fName;
    private final String fUsername;
    private final String fEmail;
    private final String fPassword;
    
    public Faculty(String fEmail, String fPassword, String fUsername, String fName) {
        this.fEmail = fEmail;
        this.fPassword = fPassword;
        this.fUsername = fUsername;
        this.fName = fName;
    }
    public String toString(){
        return "Name of Faculty: "+this.fName;
    }
    @Override
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
    
}
class  Student1 implements  Cloneable{
    private final String sName;
    private final String sUsername;
    private final String sEmail;
    private final String sPassword;
    
    public Student1(String sEmail, String sPassword, String sUsername, String sName) {
        this.sEmail = sEmail;
        this.sPassword = sPassword;
        this.sUsername = sUsername;
        this.sName = sName;
    }
    public String toString(){
        return "Name of Student : "+this.sName ;
    }
    @Override
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
        
    }
    
}
class  Admin implements  Cloneable{
    private final String aName;
    private final String aUsername;
    private final String aEmail;
    private final String aPassword;
    
    Admin(String aEmail, String aPassword, String aUsername, String aName) {
        this.aEmail = aEmail;
        this.aPassword = aPassword;
        this.aUsername = aUsername;
        this.aName = aName;
    }
    @Override
    public String toString(){
        return "Name of Admin : "+this.aName;
    }
    @Override
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
        
    }
    
}
class UserForSite implements Cloneable{
     Faculty fob;
     Admin aob;
      Student1 sob;
    public UserForSite(Faculty fob,Admin aob,Student1 sob){
        this.fob=fob;
        this.sob=sob;
        this.aob=aob;
    }
    public String toString(){
        return "Admin: "+aob+"::  Student : "+sob+":: Faculty : "+fob;
    }
    @Override
    public Object clone() throws CloneNotSupportedException{
        UserForSite uSite=(UserForSite)super.clone();
        uSite.aob=(Admin)aob.clone();
        uSite.fob=(Faculty)fob.clone();
        uSite.sob=(Student1)sob.clone();
        return uSite;
        
    }

}
public class BasicSite {
    public static void main(String[] args) {
        Admin a1=new Admin("your@gmail.com", "Wow", "UserAdmin", "Ramanjenya");
        Student1 s1 =new Student1("student@gmail.com", "Wow1", "Student1", "Salman");
        Faculty f1= new Faculty("faculty@gmail.com", "Wow2", "Faculty1", "Sharukh");
        UserForSite us1 = new UserForSite(f1, a1, s1);
        System.out.println(us1);
        try {
            UserForSite us2 =(UserForSite)us1.clone();
            System.out.println("Cloned User object : "+us2); 
            us2.aob=(Admin)new Admin("newadmin@gmail.com", "WOW1", "New Admin", "Dharam");
            us2.sob=(Student1)new Student1("newadmin@gmail.com", "WOW1", "New Admin", "Reddy");
            us2.fob=(Faculty)new Faculty("newadmin@gmail.com", "WOW1", "New Admin", "NEWONE");
            System.out.println("Old Object : "+us1);
            System.out.println("New Object with New Values: "+us2);
        } catch (CloneNotSupportedException ex) {
            System.out.println("Problems:");
        }
        
       

       


    }
    
    
}
