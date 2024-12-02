class Odd implements Runnable{
    @Override
    public void run(){
        try {
            Thread.sleep(3000);
            for (int i = 1; i <=10; i=i+2) {
            
                System.out.println("Odd Number "+i);
            
        }
        } catch (InterruptedException ex) {
        }
        System.out.println(Thread.currentThread().getName());
    
    }
}
class Even implements Runnable{
    @Override
    public void run(){
        try {
            Thread.sleep(1000);
            for (int i = 0; i <=10; i=i+2) {
            
                System.out.println("Even Number "+i);
            
        }
        } catch (InterruptedException e) {
            
        }
        System.out.println(Thread.currentThread().getName());
        
        
    }
}
public class OddEven{
    @SuppressWarnings("static-access")
    public static void main(String[] args) throws InterruptedException {
        System.out.println(Thread.currentThread().getName());
        Odd o = new Odd();
        Thread t1=new Thread(o);
        Even e= new Even();
        Thread t2=new Thread(e);
        t1.start();
        
        
        
        t2.start();
        t2.sleep(1000);
    }
    
}