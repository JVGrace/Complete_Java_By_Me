// java thread
class MyThread1 extends Thread {
    static Thread ob;
    
    public void run(){
        System.out.println("Table of 2:");
        for(int i=1;i<=10;i++){
        try {

            Thread.sleep(500);
            if (i==4) {
                ob.interrupt();
                

                continue;
            }
            
        } catch (InterruptedException e) {
            System.out.println("Interruption!!!!!-1");
        }
        System.out.println(Thread.currentThread().getName()+"  "+2+" * "+i+" = "+(2*i) );
        
    }
}
}
class MyThread2 extends Thread{
    static Thread ob;
    public void run(){
        try {
            ob.join();
        } catch (InterruptedException e) {
        }
        System.out.println("Table of 3:");
        for(int i=1;i<=10;i++){
        try {
            
            
            Thread.sleep(500);
            
        } catch (InterruptedException e) {
            System.out.println("Interruption!!!!!-2");
        }
        System.out.println(3+" * "+i+" = "+(3*i) );
        
    }
}
}
public  class threadexamples{
    public static void main(String[] args) {
        // MyThread1 t1= new MyThread1();
        // t1.start();
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();
        MyThread2.ob=t1;
        MyThread1.ob=t1;
        t1.start();
        t2.start();
        // for (int i = 0; i <=10; i++) {
        //     System.out.println("Main thread "+i);
        // }
    }
}



// Thread.getName()  gets the current threads name from 0....to...
// Thread.setName("new name")---> setName(String name)--> set name for the thread
// Thread.currentThread() gets the current thread object || is used with getName()
// Thread.currentThread().getName()-->gets the name of thread executing currently
// thread scheduler : used for setting priority to threads 
// Thread.MIN_PRIORITY -->1
// Thread.MAX_PRIORITY --> 10
// Thread.NORM_PRIORITY -->5
// t1.setPriority(5);
// t1.setPriority(Thread.NORM_PRIORITY)-->5;
// default priority for every thread 5
// child threads derives priority from the parent main thread--5
// Preventing execution of tread:
/* sleep(): pauses thread exceution for some time:: 
*  sleep(miliseconds time value)-->sleep(1000) 
*  Thread.sleep(2000) delays till time and then executes.
*  join():
*/
