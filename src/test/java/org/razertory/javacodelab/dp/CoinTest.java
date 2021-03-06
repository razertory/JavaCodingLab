package org.razertory.javacodelab.dp; import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CoinTest {
    int[] coins;
    int value;

    @Before
    public void setup(){
        this.coins = new int[]{5, 3, 4, 8, 6, 7};
        this.value = 11;
    }

    @Test
    public void coinDP() {
        Coin coin = new Coin();
        int result = coin.coinDP(coins, value);
        Assert.assertEquals(2, result);
    }

    // the time cost could be over your tolerance
    @Test
    public void coinRecursion() {
        Coin coin = new Coin();
        int result = coin.coinRecursion(coins, coins.length, value);
        Assert.assertEquals(2, result);
    }
}