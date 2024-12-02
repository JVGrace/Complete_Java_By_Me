/* Thread example with runnable inerface and lambda expression
 * but the result is small count number because main thread ends before these threads can even end 
 * Can use join method so that they will execute and end before main thread and main thread goes in waiting state
 * still it is not 2000 as we are doing for 2000 times(1000,1000) bcoz they may be executing together 
 * so to get 2000 we have to use synchornized modifier so only one thread works
 */
class Counter{
    int count=0;
    // can use synchornized in below to increase counter to 2000
    public void Count(){
        count++;
    }
}
public  class  threadExampleWithCounter{
    public static void main(String[] args) throws InterruptedException {
        Counter c = new Counter();
        Runnable A= () ->{
            for (int i = 1; i <=1000; i++) {
                c.Count();
            }
        };
        Runnable B=()->{
            for (int i = 1; i <=1000; i++) {
                c.Count();
            }
        };
        Thread t1=new Thread(A);
        Thread t2=new Thread(B);
        t1.start();
        t2.start();
        t1.join(); // join method can comment to get old output
        t2.join(); // join method can comment to get old less output
        System.out.println("Total counter after  all threads: "+c.count);


    }
}