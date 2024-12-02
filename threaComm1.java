class threadnew implements Runnable{
    int sum=0;
    @Override
    public void run(){
        synchronized (this) {
            for (int i = 1; i <=10; i++) {
                sum+=i;
            }
            System.out.println("Child thread execution completed");
            this.notify();
        }
        
    }
}
public class threaComm1{
    public static void main(String[] args)throws InterruptedException {
        threadnew m=new threadnew();
    Thread t1 =new Thread(m);
    t1.start();
    synchronized(m){
        System.out.println("Main thread syn. method call");
        m.wait();
        System.out.println("Now notify called");
        System.out.println("Final result: "+m.sum);
    }
    }
    
}