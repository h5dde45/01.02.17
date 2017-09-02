package va.t5;

import java.lang.ref.WeakReference;

public class Demo {
    public static void main(String[] args) {
        WeakReference<Integer> weakReference=new WeakReference<>(158);

        System.out.printf("before - %s\n",weakReference.get());

        for (int i = 1; weakReference.get()!= null; i++) {
            System.gc();
            System.out.printf("after %d: %s\n",i,weakReference.get());
        }

    }
}
