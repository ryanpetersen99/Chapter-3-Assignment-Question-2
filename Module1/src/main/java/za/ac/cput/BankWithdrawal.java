package za.ac.cput;

/**
 * Ryan Petersen
 * 217027806
 * 3G
 * Chapter 3 Question2
 *
 */
public class BankWithdrawal
{

    public String toString(){
        Account acc = new Account(0,0,0);
        Withdrawal withdraw = new Withdrawal(5500,500,0);
        AccountHolderDetails ahd = new AccountHolderDetails();

        return ahd.accDetails() + "\n" + "Current Balance: R" + withdraw.balance + "\n" + "Withdrawal amount: R" + withdraw.withdrawal +
                "\n" + "Bank Charges: R"+ withdraw.bankcost + "\n" + "Balance after withdrawal: R" + withdraw.withdraw();
    }
    public static void main(String[] args) {

        BankWithdrawal bw = new BankWithdrawal();
        System.out.println(bw.toString());

    }
}
