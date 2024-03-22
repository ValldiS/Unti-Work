package Account;

public class Account {
    protected long score;

    protected String title;

    public  Account(String title, long score){
        this.title = title;
        this.score = score;
    }

    public boolean  add(long amount){
        return true;
    }
    public boolean pay(long amount){
        return true;
    }
    public boolean  transfer(Account account, long amount){
        if (pay(amount)  && account.add(-amount) && amount>0){
            return true;
        } else {
            add(amount);
            return false;
        }
    }

    public long getBalance() {
        return score;
    }
}
