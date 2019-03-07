package za.ac.cput;

/**
 * Hello world!
 *
 */
public class BankWithdrawal
{








    public static void main(String[] args) {

        Account acc = new Account(0,0,0);
        Withdrawal withdraw = new Withdrawal(5500,500,0);
        AccountHolderDetails ahd = new AccountHolderDetails();



        System.out.println(ahd.accDetails());
        System.out.println("Current Balance: R" + withdraw.balance);
        System.out.println("Withdrawal amount: R" + withdraw.withdrawal);
        System.out.println("Bank Charges: R"+ withdraw.bankcost);
        System.out.println("Balance after withdrawal: R" + withdraw.withdraw());
    }
}
