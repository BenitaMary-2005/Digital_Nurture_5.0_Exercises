import org.junit.*;
import static org.junit.Assert.*;

public class CalculatorTest {

    int a, b;

    @Before
    public void setUp() {
        a = 10;
        b = 20;
        System.out.println("Setup");
    }

    @After
    public void tearDown() {
        System.out.println("Teardown");
    }

    @Test
    public void testAddition() {

        // Arrange
        int expected = 30;

        // Act
        int result = a + b;

        // Assert
        assertEquals(expected, result);
    }
}