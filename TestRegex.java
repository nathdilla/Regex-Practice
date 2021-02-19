import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TestRegex
{
    @Test
    void correctCardNumber()
    {
        account myAccount = new account();
        boolean expected = true;
        assertEquals(expected,myAccount.set_card_number("1234-1234-1234-1234"));
    }
    @Test
    void cardNumberUsesSlashes()
    {
        account myAccount = new account();
        boolean expected = false;
        assertEquals(expected,myAccount.set_card_number("1234/1234/1234/1234"));
    }
    @Test
    void cardNumberWithLetters()
    {
        account myAccount = new account();
        boolean expected = false;
        assertEquals(expected,myAccount.set_card_number("ONET-WOTH-REEF-OURR"));
    }
    @Test
    void incompleteCardNumber()
    {
        account myAccount = new account();
        boolean expected = false;
        assertEquals(expected,myAccount.set_card_number("1234-1234-1234"));
    }
    @Test
    void cardNumberWithSpecialCharacters()
    {
        account myAccount = new account();
        boolean expected = false;
        assertEquals(expected,myAccount.set_card_number("(234-!234-1?34-123*"));
    }
    @Test
    void correctCVV()
    {
        account myAccount = new account();
        boolean expected = true;
        assertEquals(expected,myAccount.set_cvv("222"));
    }
    @Test
    void CVVwithSpecialCharacters()
    {
        account myAccount = new account();
        boolean expected = false;
        assertEquals(expected,myAccount.set_cvv("-2$2"));
    }
    @Test
    void CVVwithLetters()
    {
        account myAccount = new account();
        boolean expected = false;
        assertEquals(expected,myAccount.set_cvv("TwoTwoTwo"));
    }
    @Test
    void CVVwithSpaces()
    {
        account myAccount = new account();
        boolean expected = false;
        assertEquals(expected,myAccount.set_cvv("2 2 2"));
    }
    @Test
    void correctExpDate()
    {
        account myAccount = new account();
        boolean expected = true;
        assertEquals(expected,myAccount.set_exp_date("04/55"));
    }
    @Test
    void expDateWithDots()
    {
        account myAccount = new account();
        boolean expected = false;
        assertEquals(expected,myAccount.set_exp_date("04.55"));
    }
    @Test
    void expDateWithSpaces()
    {
        account myAccount = new account();
        boolean expected = false;
        assertEquals(expected,myAccount.set_exp_date("04 55"));
    }
    @Test
    void expDateInLetters()
    {
        account myAccount = new account();
        boolean expected = false;
        assertEquals(expected,myAccount.set_exp_date("April 1955"));
    }
    @Test
    void expDateIncomplete()
    {
        account myAccount = new account();
        boolean expected = false;
        assertEquals(expected,myAccount.set_exp_date("4/55"));
    }
    @Test
    void correctName()
    {
        account myAccount = new account();
        boolean expected = true;
        assertEquals(expected,myAccount.set_name("Nathan Dilla"));
    }
    @Test
    void nameWithNumbers()
    {
        account myAccount = new account();
        boolean expected = false;
        assertEquals(expected,myAccount.set_name("Nathan Dilla 47"));
    }
    @Test
    void nameAllLowerCase()
    {
        account myAccount = new account();
        boolean expected = false;
        assertEquals(expected,myAccount.set_name("dathan dilla"));
    }
    @Test
    void nameAllUpperCase()
    {
        account myAccount = new account();
        boolean expected = false;
        assertEquals(expected,myAccount.set_name("NATHAN DILLA"));
    }
}
