public class CountThread {
    public static void main(String[] args) {
        ThreadGroup tg=new ThreadGroup("My thread group");
        Thread t1=new Thread(tg,new Runnable(){
            public void run(){
                System.out.println("Thread 1 is running");
            }
        });
        Thread t2=new Thread(tg,new Runnable(){
            public void run(){
                System.out.println("Thread 2 is running");
            }
        });
        t1.start();
        t2.start();
        int count=tg.activeCount();
        System.out.println("Number of counts = "+count);
    }
}
