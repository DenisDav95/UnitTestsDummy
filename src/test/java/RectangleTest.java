import org.junit.Assert;
import org.junit.Test;

public class RectangleTest {

    Rectangle testRectangle = new Rectangle(5.0, 2.5);

    @Test
    public void getLengthTest() {
        Assert.assertEquals( 5.0, testRectangle.getLength(), 0.0);
    }

    @Test
    public void setLengthTest() {
        testRectangle.setLength(3.0);
        Assert.assertEquals( 3.0, testRectangle.getLength(), 0.0);
    }

    @Test
    public void getWidthTest() {
        Assert.assertEquals( 2.5, testRectangle.getWidth(), 0.0);
    }

    @Test
    public void setWidthTest() {
        testRectangle.setWidth(3.0);
        Assert.assertEquals( 3.0, testRectangle.getWidth(), 0.0);
    }

    @Test
    public void getAreaTest() {
        Assert.assertEquals(12.5, testRectangle.getArea(), 0.0);
    }
}
