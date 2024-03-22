package Account;

public class CreditAccount extends Account {
    private  long CreditLimit;


    public CreditAccount(long creditLimit) {

        super("Кредитный счёт", 0);
        this.CreditLimit = creditLimit;
    }

    public CreditAccount() {
        super("Кредитный счёт", 0);
        this.CreditLimit = -10000;

    }

    @Override
    public boolean add(long amount) {
        if (score - amount >= CreditLimit && score - amount <= 0) {
            score -= amount;
            return true;
        } else {
            return false;
        }

    }

    @Override
    public long getBalance() {
        return score;
    }


    @Override
    public boolean transfer(Account account, long amount) {
        return super.transfer(account, amount);
    }

    @Override
    public boolean pay(long amount) {
        if (score - amount < CreditLimit) {
            return false;
        } else {
            score -= amount;
            return true;
        }

    }
}
