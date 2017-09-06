package as.t5;

public class ThreadSynchro2 {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 3; i++) {
            Process2 p = new Process2();
            new Thread(p).start();
        }
        Thread.sleep(5000);
    }
}

class Process2 implements Runnable {
    private String name = null;

    @Override
    public void run() {
        System.out.println(name.length());
    }
}
