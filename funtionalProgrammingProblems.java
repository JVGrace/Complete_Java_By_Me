/*  Lambda funtion using funtional interface 
 *  only works for funtional interface as it has only one method or funtion
 * see below only one line for 4 lines of code :
 * Funtion1 f1=new Function1(){
 * void F1(int i,intj){
 * }
 *  }
 * these lines are substituted with -> lambda exp 
 * then we also not need to mention funtion datatypes in funtion line: ex: F1(int i,int j): (int i ,int j): (i,j)
 * so simple and doesnt create new file for anonymolous class created instead uses psvm class increase more code
 * 
 * also we can use it to return value as well without return word see in below
 * 
 */ 

@FunctionalInterface
interface Function1{
    void F1(int i,int j);
}
@FunctionalInterface
interface Function2{
    int F2(int i,int j);
}

public class funtionalProgrammingProblems {
    public static void main(String[] args){
        Function1 f1= (i,j ) -> System.out.println(" i: "+i+" j: "+j+" = "+(i+j));
        f1.F1(5, 6);
        Function2 f2=(i,j)->(i+j); // insted of (){ return (i+j);} only works for return types not void type
        int result=f2.F2(7, 3);
        System.out.println("Result of F2: "+result);
    }

}