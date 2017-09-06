package as.t5;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorExample {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        Future<?> submit = executorService.submit(new SingleProcess2());
        System.out.println(submit.isDone());

        try {
//            Thread.sleep(4000);
            System.out.println("before get");
            submit.get();
            System.out.println("after get");
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        executorService.shutdown();

    }
}

class SingleProcess2 implements Runnable {
    private String name = null;

    @Override
    public void run() {
        try {
            System.out.println("start");
            Thread.sleep(3000);
            System.out.println("ok..............");
            System.out.println("stop");
//                    System.out.println(name.length());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
