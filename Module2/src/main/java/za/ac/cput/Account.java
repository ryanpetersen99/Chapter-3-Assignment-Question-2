package za.ac.cput;

/**
 * Hello world!
 *
 */
public class Account {
    int balance;
    int withdrawal;
    int bankcost;

    public Account(int balance,int withdrawal,int bankcost){
        this.balance = balance;
        this.withdrawal = withdrawal;
        this.bankcost = bankcost;
        }

        public boolean Validation(){
        return( balance > withdrawal);
    }
    }

