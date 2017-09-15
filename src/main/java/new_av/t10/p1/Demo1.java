package new_av.t10.p1;

public class Demo1 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
//            new HelloThread().start();
            new Thread(new HelloRunnable()).start();
//            new Thread(()-> System.out.println(Thread.currentThread().getName())).start();
        }
        System.out.println("main thread");
    }

    private static class HelloThread extends Thread{
        @Override
        public void run() {
            System.out.println(getName());
        }
    }
    private static class HelloRunnable implements Runnable{
        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName());
        }
    }
}
