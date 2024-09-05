public class oddEvenRunnable implements Runnable {
    private int start;
    private int end;
    private boolean isEven;

    public oddEvenRunnable(int start, int end, boolean isEven) {
        this.start = start;
        this.end = end;
        this.isEven = isEven;
    }

    public void run() {
        for (int i = start; i < end; i++) {
            if (isEven && i % 2 == 0) {
                System.out.println(i);
            } else if (!isEven && i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}
