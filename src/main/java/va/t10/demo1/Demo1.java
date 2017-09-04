package va.t10.demo1;

public class Demo1 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new HelloThread().start();
        }
        System.out.println("Main thread..");
        System.out.println("****************");

        for (int i = 0; i < 10; i++) {
            new Thread(()->
                    System.out.println("Runnable - "+
                            Thread.currentThread().getName()+".."))
                    .start();
        }

    }
    private static class HelloThread extends Thread{
        @Override
        public void run() {
            System.out.println("Thread - "+getName()+"..");
        }
    }
//    private static class HelloRunnable implements Runnable{
//        @Override
//        public void run() {
//            System.out.println("Runnable - "+Thread.currentThread().getName()+"..");
//        }
//    }
}
