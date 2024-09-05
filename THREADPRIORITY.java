public class THREADPRIORITY {
    public static void main(String[] args) {
        Thread t1=new Thread1();
        Thread t2=new Thread2();
        t2.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        t2.start();
        try{
            t1.join();
            t2.join();
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Both threads have finished executing!");
    }
}
class Thread1 extends Thread{
    public void run(){
        for(int i=0;i<9;i++){
            System.out.println("Thread 1 : "+i);
        }
    }
}
class Thread2 extends Thread{
    public void run(){
        for(int i=0;i<9;i++){
            System.out.println("Thread 2 : "+i);
        }
    }
}
