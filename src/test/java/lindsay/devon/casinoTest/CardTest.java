package lindsay.devon.casinoTest;

import lindsay.devon.casino.Card;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by devon on 10/2/16.
 */
public class CardTest {
    @Test
    public void setValueTest() {
        Card card = new Card(2, Card.Suit.CLUBS);
        int expected = 2;
        int actual = card.value;
        Assert.assertEquals("2 should equal 2", expected, actual);
    }

    @Test
    public void setNameTest() {
        Card card = new Card(1, Card.Suit.CLUBS);
        String expected = "Ace of CLUBS";
        String actual = card.name;
        Assert.assertEquals("Ace of CLUBS", expected, actual);
    }
}
