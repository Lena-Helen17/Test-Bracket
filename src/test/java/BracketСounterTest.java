import org.junit.Assert;
import org.junit.jupiter.api.Test;

class BracketСounterTest {

    BracketСounter testClass = new BracketСounter();

    @Test
    void counterNull() {
        String string = "";
        String expectedResult  = "0";
        String result = testClass.counter(string);
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    void counterTwo() {
        String string = "(()";
        String expectedResult  = "2 - ()";
        String result = testClass.counter(string);
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    void counterFour() {
        String string = ")()())";
        String expectedResult  = "4 - ()()";
        String result = testClass.counter(string);
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    void counterZero() {
        String string = ")(";
        String expectedResult  = "0";
        String result = testClass.counter(string);
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    void counterNotBarcket() {
        String string = ") () ((((";
        String expectedResult  = "2 - ()";
        String result = testClass.counter(string);
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    void counterIntoBarcket() {
        String string = "((()()))";
        String expectedResult  = "8 - ((()()))";
        String result = testClass.counter(string);
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    void counterSix() {
        String string = ")(()())";
        String expectedResult  = "6 - (()())";
        String result = testClass.counter(string);
        Assert.assertEquals(expectedResult, result);
    }
}