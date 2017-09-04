package va.t10.demo4;

public class Account {
    private long balance;

    public Account() {
        this(0L);
    }

    public Account(long balance) {
        this.balance = balance;
    }

    public long getBalance() {
        return balance;
    }

    public
    synchronized
    void deposit(long amount) {
        checkAmountNonNegative(amount);
            balance += amount;
            notifyAll();
    }

    public
    synchronized
    void withDraw(long amount) {
        checkAmountNonNegative(amount);
        if (balance < amount) {
            throw new IllegalArgumentException("not enough money");
        }
            balance -= amount;
    }

    public
    synchronized
    void waitAndwithDraw(long amount) throws InterruptedException {
        checkAmountNonNegative(amount);
        if (balance < amount) {
            wait(1000);
            System.out.println("wakeup = "+balance);
        }
            balance -= amount;
    }

    private void checkAmountNonNegative(long amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("negative amount");
        }
    }
}
