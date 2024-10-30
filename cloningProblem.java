/* Another Simple Deep Clone Problem that is simple to understand than the previous clone problem
 * This one is far simple with two objects to Understand
 * @author: Pradumn Patel
 */
class Student implements Cloneable{
    String stname;
    Institute obj;
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}
class Institute implements  Cloneable{
    Student st;
    String inname;
    String idAdd;
    public Object clone() throws CloneNotSupportedException{
        Institute inst=(Institute)super.clone();
        inst.st=(Student)st.clone();
        return st;
    }
    
}
public class cloningProblem {
    public static void main(String[] args)throws  CloneNotSupportedException{
        System.out.println("Original Object Student");
        Student st1=new Student();

        st1.stname="Hello";
        Student st2 = (Student)st1.clone();
        Institute inst=new Institute();
        Student st3= (Student) inst.st.clone();

        st2.stname="Wow New Name";
        st3.stname="NONOW";
        System.out.println("New object created: "+st2.stname);
        System.out.println("New deep object: "+st3.stname);

    }
}
