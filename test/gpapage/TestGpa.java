package gpapage;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestGpa {

    public TestGpa() {
    }

    @Test
    public void test() {

        gpaReport report = new gpaReport();
        assertEquals(4.00, report.calculateGpa(86, 100, 3));

    }
}
