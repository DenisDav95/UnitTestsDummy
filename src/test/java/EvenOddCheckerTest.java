import org.junit.Assert;
import org.junit.Test;

public class EvenOddCheckerTest {

    @Test
    public void checkTrueTest() {
        Assert.assertTrue("The result is not correct", EvenOddChecker.check(2));
    }

    @Test
    public void checkFalseTest() {
        Assert.assertFalse("The result is not correct", EvenOddChecker.check(5));
    }
}
