package za.ac.cput;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for simple AccountHolderDetails.
 */
public class AccountHolderDetailsTest
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void test()
    {

        AccountHolderDetails ahd = new AccountHolderDetails();

        String actual = "Account Holder: Ryan Petersen Account Number: 536637182 ";
        Assert.assertNotSame(actual,ahd.accDetails());

    }
}
