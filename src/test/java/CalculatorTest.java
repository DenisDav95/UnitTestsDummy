import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

    Calculator calc = new Calculator();

    @Test
    public void addTest() {
        Assert.assertEquals("The result is not correct", 8, calc.add(3,5));
    }

    @Test
    public void subtractTest() {
        Assert.assertEquals("The result is not correct", 9, calc.subtract(19,10));
    }

    @Test
    public void multiplyTest() {
        Assert.assertEquals("The result is not correct", 15, calc.multiply(3,5));
    }

    @Test
    public void divide() {
        Assert.assertEquals("The result is not correct", 7, calc.divide(49,7));
    }
}
