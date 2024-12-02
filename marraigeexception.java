import java.util.Scanner;
class marraigeexception{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Age");
        int age =sc.nextInt();
        sc.close();
        if(age<20){
            throw new LessAgeException("Less Age Not eligible");
            
        }
        else if(age>30){
            throw new GreaterAgeException("Greater age not eligible");
        }
        else{
            System.out.println("Eligible!!");
        }
       
    }
    
}
class LessAgeException extends RuntimeException{
    LessAgeException(String msg){
        super(msg);
    }

}
class GreaterAgeException extends RuntimeException{
    GreaterAgeException(String msg){
        super(msg);
    }

}

