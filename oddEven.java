public class oddEven{
    public static void main(String[] args) {
        Thread e=new Thread(new oddEvenRunnable(10,20,true));
        Thread o=new Thread(new oddEvenRunnable(21,30,false));
        e.start();
        o.start();
    }
}
