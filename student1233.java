
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

class St{
    private final String stName;
     final int stMarks;
    private final String stID;
    public St(String stName,int  stMarks,String stID){
        this.stID=stID;
        this.stMarks=stMarks;
        this.stName=stName;
    }
    
    @Override
    public String toString(){
        return "Student Name: "+this.stName+" Marks: "+this.stMarks+" ID: "+this.stID;
    }
}
public class student1233 {
    public static void main(String[] args) {
        Collection st = new ArrayList();
        
        st.add(new St("Nayan",76,"Abc432"));
        st.add(new St("Nayan",34,"Abc201"));
        st.add(new St("Mayank",3,"Abd621"));
        System.out.println("Student Object : "+st);
        Iterator itr=st.iterator();
        int i=0;
        while (itr.hasNext()) {
            St s1=(St)itr.next();
            if(s1.stMarks<50){
                st.remove(i);
                i++;
            }
            
         }
    }
}
