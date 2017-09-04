package va.t10.demo3;

public class Demo3 {

    public static void main(String[] args) throws InterruptedException {
        Account account=new Account(100_000);
        System.out.println(account.getBalance());

        Thread withDrawThread=new WithDrawThead(account);
        Thread depositThread=new DepositThead(account);

        withDrawThread.start();
        depositThread.start();

        withDrawThread.join();
        depositThread.join();

        System.out.println("End balance = "+account.getBalance());

    }
    private static class WithDrawThead extends Thread{
        private final Account account;

        private WithDrawThead(Account account) {
            this.account = account;
        }

        @Override
        public void run() {
            for (int i = 0; i < 20_000; i++) {
                account.withDraw(1);
            }
        }
    }
    private static class DepositThead extends Thread{
        private final Account account;

        private DepositThead(Account account) {
            this.account = account;
        }

        @Override
        public void run() {
            for (int i = 0; i < 20_000; i++) {
                account.deposit(1);
            }
        }
    }
}
