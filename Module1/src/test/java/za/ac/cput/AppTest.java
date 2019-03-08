package za.ac.cput;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void test(){
        BankWithdrawal bw = new BankWithdrawal();
        String expected = "Account Holder: Ryan Petersen Account Number: 536637182\n" + "Current Balance: R5500\n" + "Withdrawal amount: R500\n" +
                "Bank Charges: R10\n" + "Balance after withdrawal: R4990";
        Assert.assertEquals(expected,bw.toString());

    }
}
