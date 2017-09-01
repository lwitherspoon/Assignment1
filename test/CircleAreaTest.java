import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CircleAreaTest {
    private static final double PRECISION = 0.00001;

    @Test
    public void evaluatesExpression() {
        double radius = 5.5;

        // assert statements
        assertEquals("area for radius 5.5 should be ", 95.03317, Circle.getArea(radius), PRECISION);
    }
}