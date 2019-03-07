package za.ac.cput;

/**
 * Hello world!
 *
 */
public class Withdrawal extends Account {
    Account account = new Account(balance, withdrawal,bankcost);

    public Withdrawal(int balance, int withdrawal,int bankcost) {
        super(balance, withdrawal,bankcost);
        this.bankcost = 10;
    }

    public int withdraw() {
            return balance - withdrawal - bankcost;
        }
    }


