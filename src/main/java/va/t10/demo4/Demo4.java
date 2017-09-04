package va.t10.demo4;

public class Demo4 {

//    @SuppressWarnings("all")
    public static void main(String[] args) throws InterruptedException {

        Account account=new Account(0);
       new DepositThead(account).start();

        System.out.println("calling waitAndWithDraw");

        account.waitAndwithDraw(50_000_000);

        System.out.println("finished ");

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
            for (int i = 0; i < 50_000_000; i++) {
                account.deposit(1);
            }
        }
    }
}
