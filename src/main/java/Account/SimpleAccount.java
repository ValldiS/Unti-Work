package Account;

public class SimpleAccount extends Account {
    public SimpleAccount() {
        super("Дебиточвый счёт", 0);
    }

    @Override
    public boolean add(long amount) {
        if (amount>0){
            score+= Math.abs(amount);
            return true;
        }else {
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
        if (score >= amount) {
            score-=amount;
            return true;
        } else {
            return false;
        }
    }
}
