/*Synchonized method : only one thread executes for method or block declared
 * but does not work for 2 objects created : works for one object that has multiple threads
 * Below two thread executes but the very first thread that starts completes its execution first
 * either thread-0.......thread-1 or thread-1......thread-0 only these not random of both
 */

class myThread implements  Runnable{
    @Override
    public void run(){
        disp();
    }
    synchronized static public void disp(){
        for (int i = 0; i <=10; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
            System.out.println(Thread.currentThread().getName());
        }
    }
}
public class synchornizeddemo{
    public static void main(String[] args) {
        myThread m1 = new myThread();
        myThread m2 = new myThread();
        Thread t1=new Thread(m1);
        Thread t2=new Thread(m2);
        t1.start();
        t2.start();

    }
}
/* Synchronized block : this can be added inside methods and will function(inside block) in synchronized way
 * other than the block all executes in non synchronized way leading to messy output
 * synchornized(this){
 *      for (int i = 0; i <=10; i++) {
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
            System.out.println("Synchronized area block ");
        }
 * }
 * 
 * 
 * 
 * 
 * 
 */