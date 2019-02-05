import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ExampleTest {

    Example testedExample;

    @BeforeMethod
    public void setUp() {
        testedExample = new Example();
    }

    @Test
    public void testFunkce() {
        Example example2 = new Example();
        testedExample.field = 2;
        example2.field = 3;

        assertEquals(testedExample.field, 2);
        assertEquals(example2.field, 3);
    }
}