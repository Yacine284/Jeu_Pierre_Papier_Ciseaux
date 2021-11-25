import org.junit.Assert;
import org.junit.Test


public class GameOptionTest {

   
    public void test1(){
        Assert.assertTrue(GameOption.PIERRE.isWinBy(GameOption.PAPIER));
        Assert.assertTrue(GameOption.PAPIER.isWinBy(GameOption.CISEAUX));
        Assert.assertTrue(GameOption.CISEAUX.isWinBy(GameOption.PIERRE));

        Assert.assertFalse(GameOption.PIERRE.isWinBy(GameOption.CISEAUX));
        Assert.assertFalse(GameOption.CISEAUX.isWinBy(GameOption.PAPIER));

        Assert.assertTrue(GameOption.valueOf(1).equals(GameOption.PIERRE));
        Assert.assertTrue(GameOption.valueOf(2).equals(GameOption.PAPIER));
        Assert.assertTrue(GameOption.valueOf(3).equals(GameOption.CISEAUX));
    }
}