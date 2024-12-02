/*
 * two threads executing same object can communicate using wait() and notify() methods
 * but must be used in synchornized areas only;
 * Available in Object class only that is used with class objects not with thread objects
 */
class MyThreadnew implements Runnable{
    int sum=0;
    @Override
    public void run(){
        for (int i = 1; i <=10; i++) {
            sum+=i;
        }
    }
}
public class threadComm{
    public static void main(String[] args){
        MyThreadnew m1=new MyThreadnew();
        Thread t1=new Thread(m1);
        t1.start();
        try {
            Thread.sleep(1);
        } catch (Exception e) {
        }
        System.out.println("The final result of sum of 10 numbers: "+m1.sum);

    }
}

