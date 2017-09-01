import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CirclePerimeterTest {
    private static final double PRECISION = 0.00001;

    @Test
    public void evaluatesExpression() {
        double radius = 5.5;

        // assert statements
        assertEquals("perimeter for radius 5.5 should be ", 34.55751, Circle.getPerimeter(radius), PRECISION);
    }

}
