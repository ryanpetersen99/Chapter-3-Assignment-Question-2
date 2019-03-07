package za.ac.cput;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for simple Withdrawal.
 */
public class WithdrawalTest
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void test()
    {
        Withdrawal withdraw = new Withdrawal(4000,500,0);
        Assert.assertEquals(3500,withdraw.withdraw());
    }
}
