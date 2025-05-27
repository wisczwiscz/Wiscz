package DataAnalysis;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class DataAnalyzerTest {
    
    @Test
    public void testCalculateMean() {
        List<Double> numbers = Arrays.asList(1.0, 2.0, 3.0, 4.0, 5.0);
        assertEquals(3.0, DataAnalyzer.calculateMean(numbers), 0.001);
    }

    @Test
    public void testCalculateMedian() {
        List<Double> numbers = Arrays.asList(1.0, 2.0, 3.0, 4.0, 5.0);
        assertEquals(3.0, DataAnalyzer.calculateMedian(numbers), 0.001);
        
        List<Double> evenNumbers = Arrays.asList(1.0, 2.0, 3.0, 4.0);
        assertEquals(2.5, DataAnalyzer.calculateMedian(evenNumbers), 0.001);
    }

    @Test
    public void testCalculateStandardDeviation() {
        List<Double> numbers = Arrays.asList(2.0, 4.0, 4.0, 4.0, 5.0, 5.0, 7.0, 9.0);
        assertEquals(2.0, DataAnalyzer.calculateStandardDeviation(numbers), 0.001);
    }

    @Test
    public void testFindMax() {
        List<Double> numbers = Arrays.asList(1.0, 2.0, 3.0, 4.0, 5.0);
        assertEquals(5.0, DataAnalyzer.findMax(numbers), 0.001);
    }

    @Test
    public void testFindMin() {
        List<Double> numbers = Arrays.asList(1.0, 2.0, 3.0, 4.0, 5.0);
        assertEquals(1.0, DataAnalyzer.findMin(numbers), 0.001);
    }

    @Test
    public void testCalculateRange() {
        List<Double> numbers = Arrays.asList(1.0, 2.0, 3.0, 4.0, 5.0);
        assertEquals(4.0, DataAnalyzer.calculateRange(numbers), 0.001);
    }

    @Test
    public void testEmptyList() {
        List<Double> emptyList = new ArrayList<>();
        assertThrows(IllegalArgumentException.class, () -> DataAnalyzer.calculateMean(emptyList));
        assertThrows(IllegalArgumentException.class, () -> DataAnalyzer.calculateMedian(emptyList));
        assertThrows(IllegalArgumentException.class, () -> DataAnalyzer.calculateStandardDeviation(emptyList));
        assertThrows(IllegalArgumentException.class, () -> DataAnalyzer.findMax(emptyList));
        assertThrows(IllegalArgumentException.class, () -> DataAnalyzer.findMin(emptyList));
        assertThrows(IllegalArgumentException.class, () -> DataAnalyzer.calculateRange(emptyList));
    }

    @Test
    public void testNullList() {
        List<Double> nullList = null;
        assertThrows(IllegalArgumentException.class, () -> DataAnalyzer.calculateMean(nullList));
        assertThrows(IllegalArgumentException.class, () -> DataAnalyzer.calculateMedian(nullList));
        assertThrows(IllegalArgumentException.class, () -> DataAnalyzer.calculateStandardDeviation(nullList));
        assertThrows(IllegalArgumentException.class, () -> DataAnalyzer.findMax(nullList));
        assertThrows(IllegalArgumentException.class, () -> DataAnalyzer.findMin(nullList));
        assertThrows(IllegalArgumentException.class, () -> DataAnalyzer.calculateRange(nullList));
    }
} 