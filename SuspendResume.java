import java.lang.*;
import java.util.*;
public class SuspendResume {
    public static void main(String[] args) {
        Thread t=new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<10;i++){
                    System.out.println("Thread is running : "+i);
                }
                try{
                    Thread.sleep(1000);
                }
                catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        });
        t.start();
        t.suspend();
        try{
            Thread.sleep(5000);
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
        t.resume();
        try{
            t.join();
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}
